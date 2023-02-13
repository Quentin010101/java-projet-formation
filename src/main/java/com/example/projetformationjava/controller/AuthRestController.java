package com.example.projetformationjava.controller;

import com.example.projetformationjava.model.bean.AuthBean;
import com.example.projetformationjava.model.bean.UserBean;
import com.example.projetformationjava.model.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AuthRestController {

    @Autowired
    private UserService userService;

    // Permet de s’identifier
    @PostMapping("/login")
    public UserBean login(@RequestBody AuthBean auth) throws Exception {

        try {
            if (auth.getPseudo().trim() == null || auth.getPassword() == null) {
                throw new Exception("Login credential required");
            }

            UserBean user = userService.getUserByPseudo(auth.getPseudo().trim());

            if (user == null) {
                throw new Exception("Credential are not correct");
            }

            if (auth.getPseudo() != auth.getPseudo().trim() || auth.getPassword() != user.getPassword()) {
                throw new Exception("Credential are not correct");
            }

            return user;

        }catch(Exception e){
            e.printStackTrace();
            return null;
        }
    }

    // Permet de s’enregistrer
    @PostMapping("/signin")
    public void signin(@RequestBody AuthBean auth){

        try{
            // Check if credential are null
            if(auth.getPseudo().trim() == null || auth.getPassword() == null || auth.getEmail() == null){
                throw new Exception("Register credential required");
            }

            // Check if password contain at least 6 char
            if(auth.getPassword().length() < 6){
                throw new Exception("Password must contain 6 characteres");
            }

            // Check if pseudo is unique
            if(userService.userPseudoExists(auth.getPseudo().trim()) != null){
                throw new Exception("User already exist");
            }



        }catch (Exception e){

        }
    }
}

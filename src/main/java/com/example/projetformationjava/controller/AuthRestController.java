package com.example.projetformationjava.controller;

import com.example.projetformationjava.model.bean.dao.AuthBean;
import com.example.projetformationjava.model.bean.dao.UserBean;
import com.example.projetformationjava.model.bean.dto.MessageBean;
import com.example.projetformationjava.model.service.UserService;
import jakarta.servlet.http.HttpSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Date;
import java.util.Objects;

@RestController
@CrossOrigin(origins = "http://localhost:4200", allowCredentials = "true")
public class AuthRestController {

    @Autowired
    private UserService userService;

    // Permet de s’identifier
    @PostMapping("/login")
    public MessageBean login(HttpSession httpSession, @RequestBody AuthBean auth){
        System.out.println("login");

        try {
            // Check if credential are null
            if (auth.getPseudo().trim().length() == 0 ||
                    auth.getPassword() == null)
            {
                throw new Exception("Login credential required.");
            }

            // Check if user existe
            UserBean user = userService.getUserByPseudo(auth.getPseudo().trim());
            if (user == null) {
                throw new Exception("User dosent exists.");
            }

            // Check if credentials are correct
            if (!Objects.equals(auth.getPseudo(), auth.getPseudo().trim()) ||
                    !Objects.equals(auth.getPassword(), user.getPassword()))
            {
                throw new Exception("Credentials are not correct");
            }

            httpSession.setMaxInactiveInterval(120);
            user.setSessionId(httpSession.getId());
            userService.saveUser(user);

            return new MessageBean(true, "You're log in.", httpSession.getId());

        }catch(Exception e){
            e.printStackTrace();
            return new MessageBean(false, e.getMessage());
        }
    }

    // Permet de s’enregistrer
    @PostMapping("/signin")
    public MessageBean signin(@RequestBody AuthBean auth){
        System.out.println("signin");

        try{
            // Check if credential are null
            if(auth.getPseudo().trim().length() == 0 ||
                    auth.getPassword().length() == 0 ||
                    auth.getEmail().length() == 0)
            {
                throw new Exception("Register credential required");
            }

            // Check if password contain at least 6 char
            if(auth.getPassword().length() < 6){
                throw new Exception("Password must contain 6 characteres");
            }

            // Check if pseudo is unique
            if(userService.userPseudoExists(auth.getPseudo().trim())){
                throw new Exception("User already exist");
            }

            UserBean user = new UserBean(auth.getPseudo().trim(),
                                         auth.getPassword(),
                                         auth.getEmail(),
                                        "ROLE_USER",
                                        new Date().getTime()
            );

            userService.saveUser(user);

            return new MessageBean(true, "User has been saved");

        }catch (Exception e){
            e.printStackTrace();
            return new MessageBean(false, e.getMessage());
        }
    }

    @GetMapping("logout")
    public void logOut(HttpSession httpSession){
        System.out.println("logout");

        UserBean user = userService.getUserBySession(httpSession.getId());

        if(user != null){
            user.setSessionId("");
            userService.saveUser(user);
        }
    }
}

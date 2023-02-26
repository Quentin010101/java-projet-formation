package com.example.projetformationjava.controller;

import com.example.projetformationjava.model.bean.dto.AuthBean;
import com.example.projetformationjava.model.bean.dao.UserBean;
import com.example.projetformationjava.model.bean.dto.ReturnMessageBean;
import com.example.projetformationjava.model.service.UserService;
import jakarta.servlet.http.HttpSession;
import org.mindrot.jbcrypt.BCrypt;
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
    public ReturnMessageBean login(HttpSession httpSession, @RequestBody AuthBean auth){
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
            if (!Objects.equals(user.getPseudo(), auth.getPseudo().trim()))
            {
                throw new Exception("Credentials are not correct");
            }
            System.out.println(BCrypt.hashpw("123456", BCrypt.gensalt()));
            if(!BCrypt.checkpw(auth.getPassword(), user.getPassword())){
                throw new Exception("Credentials are not correct.");
            }

            httpSession.setMaxInactiveInterval(60);

            // Check if session already exist
            UserBean userSession = userService.getUserBySession(httpSession.getId());
                // if exists delete his session
            if(userSession != null){
                userSession.setSessionId(null);
                userService.saveUser(userSession);
            }

            // Set user session
            user.setSessionId(httpSession.getId());
            userService.saveUser(user);

            return new ReturnMessageBean(true, "You're log in.", httpSession.getId());

        }catch(Exception e){
            e.printStackTrace();
            return new ReturnMessageBean(false, e.getMessage());
        }
    }

    // Permet de s’enregistrer
    @PostMapping("/signin")
    public ReturnMessageBean signin(@RequestBody AuthBean auth){
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
            // Create user
            UserBean user = new UserBean(auth.getPseudo().trim(),
                                         auth.getEmail(),
                                        "ROLE_USER",
                                        new Date().getTime()
            );
            // Set user password encryption
            user.encrypt(auth.getPassword());
            // Save user in db
            userService.saveUser(user);

            return new ReturnMessageBean(true, "User has been saved");

        }catch (Exception e){
            e.printStackTrace();
            return new ReturnMessageBean(false, e.getMessage());
        }
    }

    // Permet de se déconnecter
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

package com.example.projetformationjava.controller;

import com.example.projetformationjava.model.bean.UserBean;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/user")
public class UserRestController {

    // Permet de voir les infos utilisateurs
    @GetMapping("show")
    public static UserBean getUser(){
        UserBean user = new UserBean();
        //----------

        //---------
        return user;
    }

    // Permet de mettre à jour les infos utilisateurs
    @PostMapping("update")
    public static void updateUser(@RequestBody UserBean user){
        //----------

        //---------
    }
}

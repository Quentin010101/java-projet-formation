package com.example.projetformationjava.controller;

import com.example.projetformationjava.model.bean.UserBean;
import com.example.projetformationjava.model.service.UserService;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin()
@RequestMapping("/user")
public class UserRestController {

    // Permet de voir les infos utilisateurs
    @GetMapping("show")
    public static UserBean getUser(int id){
        System.out.println("getUser");
//        UserBean user = new UserBean();
        //----------
        UserBean user = UserService.getUser();
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

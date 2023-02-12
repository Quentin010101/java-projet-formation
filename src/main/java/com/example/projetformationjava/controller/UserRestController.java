package com.example.projetformationjava.controller;

import com.example.projetformationjava.model.bean.UserBean;
import com.example.projetformationjava.model.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

@RestController
@CrossOrigin()
@RequestMapping("/user")
public class UserRestController {

    @Autowired
    private UserService userService;

    // Permet de voir les infos utilisateurs
    @GetMapping("show")
    public UserBean getUser(String id){
        System.out.println("getUser");

        UserBean user = userService.getUser(id);

        return user;
    }

    // Permet de mettre à jour les infos utilisateurs
    @PostMapping("update/user")
    public static void updateUser(@RequestBody UserBean user){
        System.out.println("updateuser");
        //----------

        //---------
    }

    @PostMapping("update/avatar")
    public static void updateAvatar(@RequestParam("file") MultipartFile file, @RequestParam("id")int id){
        System.out.println("updateavatar");
        //----------

        //---------
    }
}

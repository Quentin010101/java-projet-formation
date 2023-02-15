package com.example.projetformationjava.controller;

import com.example.projetformationjava.model.bean.dao.UserBean;
import com.example.projetformationjava.model.bean.dto.UserDto;
import com.example.projetformationjava.model.bean.mapper.UserMapper;
import com.example.projetformationjava.model.bean.mapper.UserMapperImpl;
import com.example.projetformationjava.model.service.UserService;
import jakarta.servlet.http.HttpSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

@RestController
@CrossOrigin(origins = "http://localhost:4200", allowCredentials = "true")
@RequestMapping("/user")
public class UserRestController {

    @Autowired
    private UserService userService;


    // Permet de voir les infos utilisateurs
    @GetMapping("show")
    public UserBean getUser(HttpSession httpSession){
        System.out.println("getUser");

        return userService.getUserBySession(httpSession.getId());
    }

    // Permet de mettre à jour les infos utilisateurs
    @PostMapping("update/user")
    public void updateUser(HttpSession httpSession, @RequestBody UserDto userDto){
        System.out.println("update user");

        UserBean user = userService.getUserBySession(httpSession.getId());
        UserMapperImpl mapper = new UserMapperImpl();
        userService.saveUser(mapper.updateUserFromDto(userDto, user));
    }

    @PostMapping("update/avatar")
    public static void updateAvatar(@RequestParam("file") MultipartFile file, @RequestParam("id")int id){
        System.out.println("updateavatar");
        //----------

        //---------
    }
}

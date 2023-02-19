package com.example.projetformationjava.controller;

import com.example.projetformationjava.model.bean.dao.UserBean;
import com.example.projetformationjava.model.bean.dto.MessageBean;
import com.example.projetformationjava.model.bean.dto.UserDto;
import com.example.projetformationjava.model.bean.mapper.UserMapper;
import com.example.projetformationjava.model.bean.mapper.UserMapperImpl;
import com.example.projetformationjava.model.service.FileServiceImplementation;
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

    @Autowired
    private FileServiceImplementation fileService;


    // Permet de voir les infos utilisateurs
    @GetMapping("show")
    public UserBean getUser(HttpSession httpSession){
        System.out.println("getUser");

        return userService.getUserBySession(httpSession.getId());
    }

    // Permet de mettre à jour les infos utilisateurs
    @PostMapping("update/user")
    public MessageBean updateUser(HttpSession httpSession, @RequestBody UserDto userDto){
        System.out.println("update user");

        try{
            UserBean user = userService.getUserBySession(httpSession.getId());
            UserMapperImpl mapper = new UserMapperImpl();
            userService.saveUser(mapper.updateUserFromDto(userDto, user));

            return new MessageBean(true, "Information updated.");
        }catch(Exception e){

            return new MessageBean(false, e.getMessage());

        }


    }

    // Permet de mettre à jour l'avatar
    @PostMapping("update/avatar")
    public MessageBean updateAvatar(HttpSession httpSession, @RequestParam("file") MultipartFile file){
        System.out.println("update-avatar");


        try{
            // Check if user is logged
            UserBean user = userService.getUserBySession(httpSession.getId());
            if(user == null) throw new Exception("You must be logged to update avatar.");

            String path = fileService.uploadImage(file, "avatar");

            // Save path to DB
            user.setAvatarPath(path);
            userService.saveUser(user);

            return new MessageBean(true, "Avatar has been uploaded");

        }catch(Exception e){
            e.printStackTrace();
            return new MessageBean(false, e.getMessage());
        }

    }
}

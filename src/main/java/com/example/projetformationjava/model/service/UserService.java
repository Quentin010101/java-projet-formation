package com.example.projetformationjava.model.service;

import com.example.projetformationjava.model.bean.UserBean;

public class UserService {

    public static UserBean getUser(){
        UserBean user = new UserBean();
        user.setCountry("France");
        user.setEmail("qsd@gmail.com");
        user.setAvatarPath("http://localhost:8080/image/avatar/avatar.jpg");
        user.setName("Jeane");

        return user;
    }
}

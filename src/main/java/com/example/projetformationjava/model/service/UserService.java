package com.example.projetformationjava.model.service;

import com.example.projetformationjava.model.bean.UserBean;
import com.example.projetformationjava.model.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    private  UserRepository userRepository;

    public UserBean getUser(String id){

        UserBean user = userRepository.findBySessionId(id);

        return user;
    }
}

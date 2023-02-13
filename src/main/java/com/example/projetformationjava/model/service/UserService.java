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

    public void saveUser(UserBean user){
        userRepository.save(user);
    }

    public UserBean getUserByPseudo(String pseudo){
        return userRepository.findByPseudo(pseudo);
    }

    public UserBean userPseudoExists(String pseudo){
        return userRepository.existsByPseudo(pseudo);
    }
}

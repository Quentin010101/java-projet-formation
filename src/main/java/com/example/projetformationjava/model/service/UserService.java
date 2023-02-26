package com.example.projetformationjava.model.service;

import com.example.projetformationjava.model.bean.dao.UserBean;
import com.example.projetformationjava.model.bean.dto.UserDto;
import com.example.projetformationjava.model.bean.mapper.UserMapper;
import com.example.projetformationjava.model.bean.mapper.UserMapperImpl;
import com.example.projetformationjava.model.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    private  UserRepository userRepository;


    public void saveUserDto(String id, UserDto user){
        UserBean userDb = getUserBySession(id);


        System.out.println("userDb après mapping" + userDb);

        userRepository.save(userDb);
    }
    public void saveUser(UserBean user){
        userRepository.save(user);
    }

    public UserBean getUserByPseudo(String pseudo){
        return userRepository.findByPseudo(pseudo);
    }
    public UserBean getUserBySession(String session){
        return userRepository.findBySessionId(session);
    }
    public boolean userPseudoExists(String pseudo){
        return userRepository.existsByPseudo(pseudo);
    }

    public long getCountUser(){
        return userRepository.count();
    }
}

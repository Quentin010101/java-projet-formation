package com.example.projetformationjava.model.bean.mapper;

import com.example.projetformationjava.model.bean.dao.UserBean;
import com.example.projetformationjava.model.bean.dto.UserDto;

public class UserMapperImpl implements UserMapper{
    @Override
    public UserBean updateUserFromDto(UserDto dto, UserBean user) {
        if ( dto  == null ) {
            return null;
        }

        if(dto.getCountry() != null)  user.setCountry(dto.getCountry());
        if(dto.getEmail() != null)  user.setEmail( dto.getEmail() );
        if(dto.getPseudo() != null)  user.setPseudo( dto.getPseudo() );
        if(dto.getName() != null)  user.setName( dto.getName() );
        if(dto.getSurname() != null)  user.setSurname( dto.getSurname() );
        if(dto.getAvatarPath() != null)  user.setAvatarPath( dto.getAvatarPath() );

        return user;
    }

    @Override
    public UserDto updateDtoFromUser(UserDto dto, UserBean user) {
        if ( user  == null ) {
            return null;
        }

        if(user.getCountry() != null)  dto.setCountry(user.getCountry());
        if(user.getEmail() != null)  dto.setEmail( user.getEmail() );
        if(user.getPseudo() != null)  dto.setPseudo( user.getPseudo() );
        if(user.getName() != null)  dto.setName( user.getName() );
        if(user.getSurname() != null)  dto.setSurname( user.getSurname() );
        if(user.getAvatarPath() != null)  dto.setSurname( user.getAvatarPath() );


        return dto;
    }
}

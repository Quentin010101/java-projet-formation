package com.example.projetformationjava.model.bean.mapper;

import com.example.projetformationjava.model.bean.dao.UserBean;
import com.example.projetformationjava.model.bean.dto.UserDto;

public interface UserMapper {

        UserBean updateUserFromDto(UserDto dto, UserBean user);

        UserDto updateDtoFromUser(UserDto dto, UserBean user);


}

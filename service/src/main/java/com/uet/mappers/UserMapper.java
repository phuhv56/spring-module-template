package com.uet.mappers;

import com.uet.dtos.UserDTO;
import com.uet.models.User;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface UserMapper
{
    UserMapper INSTANCE = Mappers.getMapper(UserMapper.class);

    UserDTO userToUserDto(User user);

    User userDtoToUser(UserDTO dto);
}

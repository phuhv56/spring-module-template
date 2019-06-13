package com.uet.controllers;

import com.uet.dtos.UserDTO;
import com.uet.mappers.UserMapper;
import com.uet.models.User;
import com.uet.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class UserController extends BaseController
{
    @Autowired
    private UserService userService;

    @PostMapping(value = "/create")
    public ResponseEntity<?> create(@RequestBody UserDTO object) {
        try {
            User user = UserMapper.INSTANCE.userDtoToUser(object);
            return success(userService.create(user));
        } catch (Exception ex) {
            return error(ex);
        }
    }

}

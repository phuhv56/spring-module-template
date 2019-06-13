package com.uet.services;

import com.uet.models.User;
import com.uet.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImp implements UserService
{
    @Autowired
    private UserRepository userRepository;

    @Override
    public User create(User user)
    {
        User userResult = userRepository.save(user);
        return userResult;
    }
}

package com.SpringBoot.Resume_Builder.Service.impl;

import com.SpringBoot.Resume_Builder.Entity.User;
import com.SpringBoot.Resume_Builder.Service.UserService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {
    @Override
    public User createUser(User user) {
        return null;
    }

    @Override
    public User getUserById(Long id) {
        return null;
    }

    @Override
    public List<User> getAllUsers() {
        return List.of();
    }

    @Override
    public User updateUser(Long id, User newUser) {
        return null;
    }

    @Override
    public Void deleteUser(Long id) {
        return null;
    }
}

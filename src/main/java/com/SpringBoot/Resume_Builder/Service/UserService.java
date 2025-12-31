package com.SpringBoot.Resume_Builder.Service;

import com.SpringBoot.Resume_Builder.Entity.User;
import org.jspecify.annotations.Nullable;

import java.util.List;

public interface UserService {
    User createUser(User user);

    User getUserById(Long id);

    List<User> getAllUsers();

    User updateUser(Long id, User newUser);

    Void deleteUser(Long id);
}

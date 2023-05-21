package com.zangeus.ajax.service;

import org.springframework.security.core.userdetails.UserDetailsService;
import com.zangeus.ajax.model.User;

import java.util.List;

public interface UserService extends UserDetailsService {

    void addUser(User user);

    void deleteUser(Long id);

    void updateUser(User user);

    List<User> getAllUsers();

    User getUserById(Long id);

    User findByEmail(String username);

}

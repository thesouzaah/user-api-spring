package com.randomcodes.random.service;

import java.util.List;

import com.randomcodes.random.model.User;

public interface UserService {
    
    User getUser(Long id);
    List<User> getAllUsers();
    void createUser(User user);
    void deleteUser(Long id);
}

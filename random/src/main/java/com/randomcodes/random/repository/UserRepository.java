package com.randomcodes.random.repository;

import java.util.List;

import com.randomcodes.random.model.User;

public interface UserRepository {

    User findById(Long id);
    List<User> findAll();
    void save(User user);
    void deleteById(Long id);
}

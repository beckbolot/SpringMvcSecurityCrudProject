package com.beck.services;

import com.beck.model.User;

import java.util.List;

public interface UserService {

    User getUserByName(String name);

    List<User> getAllUsers();
    void addUser(User user);
    User getById(Integer id);
    void updateUser(User user);
    void deleteUser(User user);
}

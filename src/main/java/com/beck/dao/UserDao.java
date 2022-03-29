package com.beck.dao;

import com.beck.model.User;

import java.util.List;

public interface UserDao {
    User getUserByName(String username);

    List<User> getAllUsers();
    void addUser(User user);
    User getById(Integer id);
    void updateUser(User user);
    void deleteUser(User user);

}


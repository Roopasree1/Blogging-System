package com.example.dao;

import com.example.model.User;

public interface UserDao {
    boolean registerUser(User user);
    User validateUser(String email, String password);
}

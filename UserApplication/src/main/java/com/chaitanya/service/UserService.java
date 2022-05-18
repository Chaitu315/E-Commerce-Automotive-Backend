package com.chaitanya.service;

import com.chaitanya.domain.Admin;
import com.chaitanya.domain.User;
import java.util.List;

public interface UserService
{
    User saveUser(User user) ;

    List<User> getAllUsers();

    List<Admin> getAllAdmins();
}

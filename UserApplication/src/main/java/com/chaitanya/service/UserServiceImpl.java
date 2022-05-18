package com.chaitanya.service;

import com.chaitanya.domain.Admin;
import com.chaitanya.domain.User;
import com.chaitanya.repository.AdminRepository;
import com.chaitanya.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService
{
    private UserRepository userRepository;
    private AdminRepository adminRepository;

    @Autowired
    public UserServiceImpl(UserRepository userRepository, AdminRepository adminRepository)
    {
        this.userRepository = userRepository;
        this.adminRepository = adminRepository;
    }

    @Override
    public User saveUser(User user)
    {
        return userRepository.save(user);
    }

    @Override
    public List<User> getAllUsers()
    {
        return userRepository.findAll();
    }

    @Override
    public List<Admin> getAllAdmins()
    {
        return adminRepository.findAll();
    }
}

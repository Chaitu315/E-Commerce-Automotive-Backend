package com.chaitanya.controller;

import com.chaitanya.domain.User;
import com.chaitanya.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v2")
@CrossOrigin(origins = "*")
public class UserController
{
    private UserService userService;

    @Autowired
    public UserController(UserService userService)
    {
        this.userService = userService;
    }


    @PostMapping("/user")
    public ResponseEntity<?> saveUserDetails(@RequestBody User user)
    {
        userService.saveUser(user);
        return new ResponseEntity<>(user,HttpStatus.CREATED);
    }

    @GetMapping("/users")
    public ResponseEntity<?> getUsers()
    {
        return new ResponseEntity<>(userService.getAllUsers(), HttpStatus.OK);
    }

    @GetMapping("/admins")
    public ResponseEntity<?> getAdmins()
    {
        return new ResponseEntity<>(userService.getAllAdmins(), HttpStatus.OK);
    }
}

package com.kalyan.controller;

import com.kalyan.model.User;
import com.kalyan.repository.UserRepository;
import com.kalyan.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;


@RestController
@RequestMapping("/api/users")
public class UserController {
    @Autowired
    UserService userService;

    @PostMapping("/createuser")
   public User createUser(@RequestBody User user){
       return userService.createUser(user);
   }

   @GetMapping("/{id}")
   public User getUser(@PathVariable Long id){
        return userService.getUserById(id);
   }
}


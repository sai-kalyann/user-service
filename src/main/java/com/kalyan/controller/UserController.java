package com.kalyan.controller;

import com.kalyan.model.User;
import com.kalyan.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.web.bind.annotation.*;


@RestController
//@RequestMapping("/")
public class UserController {
    @Autowired
    private UserRepository userRepository;

    @PostMapping("/api/users")
    public User createUser(@RequestBody User user){
        return userRepository.save(user);
    }
    @GetMapping("/api/users")
    public User getUser(){
        User user = new User();
        user.setEmail("kalyansaig22@gmail.com");
        user.setFullName("sai kalyan gatttu");
        user.setPhone("+1 3147606940");
        user.setRole("customer");
        return user;
    }
}

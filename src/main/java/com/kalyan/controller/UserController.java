package com.kalyan.controller;

import com.kalyan.exception.UserException;
import com.kalyan.model.User;
import com.kalyan.repository.UserRepository;
import com.kalyan.service.UserService;
import jakarta.persistence.PostUpdate;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;


@RestController
@RequestMapping("/api/users")
public class UserController {
    @Autowired
    UserService userService;

    @PostMapping("/createuser")
   public User createUser(@RequestBody @Valid User user){
       return userService.createUser(user);
   }

   @GetMapping("/{id}")
   public User getUser(@PathVariable Long id) throws Exception {
        return userService.getUserById(id);
   }
   @GetMapping("/all")
   public List<User> getUsers(){
        return userService.getUsers();
   }

   @PutMapping("/update/{id}")
   public User updateUser(@PathVariable Long id,@RequestBody User user1) throws Exception {
        return userService.updateUser(user1,id);
   }
   @DeleteMapping("/delete/{id}")
   public String deleteUserById(@PathVariable Long id) throws UserException {
       userService.deleteUser(id);
      return "Deleted the user by id:"+id;
   }
}


package com.kalyan.service;

import com.kalyan.exception.UserException;
import com.kalyan.model.User;
import com.kalyan.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;
import java.util.Optional;

@Service
public class UserService {
    @Autowired
    private UserRepository userRepository;


    public User createUser(@RequestBody User user) {

        return userRepository.save(user);
    }

    public User getUserById(Long id) throws Exception{
        Optional<User> user=userRepository.findById(id);
        if(user.isPresent())
        {
            return user.get();
        }
        throw new UserException("User not found with id:"+id);
    }

    public List<User> getUsers() {
        return userRepository.findAll();
    }

    public User updateUser(@RequestParam User user1, @RequestParam Long id) throws Exception {
//        User existngUser = getUserById(id);
        Optional<User> existngUser=userRepository.findById(id);
        if(existngUser.isEmpty())
        {
            throw new UserException("User not found with id:"+id);
//            return existngUser.get();
        }

        existngUser.get().setFullName(user1.getFullName());
        existngUser.get().setPhone(user1.getPhone());
        existngUser.get().setRole(user1.getRole());
        existngUser.get().setEmail(user1.getEmail());
        return existngUser.get();
    }

    public void deleteUser(Long id) throws UserException {
        if (!userRepository.existsById(id)) {
            throw new UserException("User not found with id:"+id);
        }
        else{
            userRepository.deleteById(id);
        }
    }
}

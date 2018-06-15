package com.jcombat.profile;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    @Autowired
    UserRepository userRepository;

    @CrossOrigin(origins = "http://localhost:2222")
    @RequestMapping("/users")
    public User[] all() {
        List<User> users = userRepository.getAllUsers();
        return users.toArray(new User[users.size()]);
    }

    @CrossOrigin(origins = "http://localhost:2222")
    @RequestMapping("/user/{name}/{password}")
    public User byId(@PathVariable("name") String userName,
                     @PathVariable("password") String password)  {
        if (userRepository.CheckPassword(userName, password))
        {

        }
        User user = userRepository.getUserByName(userName);
        return user;
    }
}
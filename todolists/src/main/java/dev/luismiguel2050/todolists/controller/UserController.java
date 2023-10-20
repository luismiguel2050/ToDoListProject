package dev.luismiguel2050.todolists.controller;

import dev.luismiguel2050.todolists.model.User;
import dev.luismiguel2050.todolists.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {


    @Autowired
    private UserService userService;

    /*@GetMapping("/")
    public String welcome(){
        return "Welcome to ToDoLists";
    }

    @GetMapping("/{username}")
    public User getUser(@RequestParam String username){
        return userService.getUserByUsername(username);
    }*/
}

package dev.luismiguel2050.todolists.controller;

import dev.luismiguel2050.todolists.model.User;
import dev.luismiguel2050.todolists.service.UserService;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.rmi.ServerException;
import java.util.List;

@RestController
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class UserController {


    @Autowired
    private UserService userService;

    @GetMapping("/")
    public String welcome(){
        return "Welcome to ToDoLists";
    }

    @GetMapping("/{username}")
    public User getUser(@PathVariable String username){
        return userService.getUserByUsername(username);
    }

    //TODO 'deal with same username exception when creating user or updating
    @GetMapping("/users")
    public List<User> getUsers(){
        return userService.getUserList();
    }

    @PostMapping("/addUser")
    public User addUser(@RequestBody User newUser){
        return userService.saveUser(newUser);
    }

    @PutMapping("/update/{id}")
    public User updateUser(@PathVariable long id, @RequestBody User user){
        User updatedUser = userService.getUserById(id);
        updatedUser.setPassword(user.getPassword());
        updatedUser.setUsername(user.getUsername());
        userService.saveUser(updatedUser);
        return updatedUser;
    }

    @DeleteMapping("/delete/{id}")
    public void deleteUser(@PathVariable long id){
        userService.deleteUser(id);
    }
}

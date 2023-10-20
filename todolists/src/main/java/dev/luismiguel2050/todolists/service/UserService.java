package dev.luismiguel2050.todolists.service;

import dev.luismiguel2050.todolists.model.User;
import dev.luismiguel2050.todolists.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@Service
public class UserService {
    @Autowired
    private UserRepository userRepository;

    public User getUserByUsername(String username){
        return userRepository.findByUsername(username);
    }
  /*  @PostMapping("/users")
    public User saveUser(@RequestBody User user){

    }*/
}

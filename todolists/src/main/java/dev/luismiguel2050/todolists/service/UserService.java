package dev.luismiguel2050.todolists.service;

import dev.luismiguel2050.todolists.model.User;
import dev.luismiguel2050.todolists.repository.UserRepository;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;
import java.util.Optional;

@Service
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class UserService {
    @Autowired
    private UserRepository userRepository;

    public User getUserByUsername(String username){
        return userRepository.findByUsername(username);
    }
    public List<User> getUserList() {
        return userRepository.findAll();
    }
    public User saveUser(@RequestBody User user){
        return userRepository.save(user);
    }


    public User getUserById(Long userId) {
        return userRepository.findById(userId).get();
    }

    public void deleteUser(long id) {
        userRepository.deleteById(id);
    }
}

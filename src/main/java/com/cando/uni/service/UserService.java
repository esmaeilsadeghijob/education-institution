package com.cando.uni.service;

import com.cando.uni.model.User;
import java.util.List;
import java.util.Optional;
import com.cando.uni.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserService {


    @Autowired
    private UserRepository userRepository;

    public List<User> users() {
        return userRepository.findAll();
    }

    public User findUserById(Long id) {
        Optional<User> userOptional = userRepository.findById(id);
        return userOptional.orElse(null);
    }

    public List<User> findUserByEmail(String email) {
        Optional<List<User>> userOptional = userRepository.findByEmail(email);
        return userOptional.orElse(null);
    }


    public User save(User user) {
        return userRepository.save(user);
    }

    public void delete(Long id) {
        userRepository.deleteById(id);
    }

    public void update(User user) {
        Optional<User> userOptional = userRepository.findById(user.getId());

        userOptional.get().setUsername(user.getUsername());
        userOptional.get().setPassword(user.getPassword());
        userOptional.get().setPhone(user.getPhone());
        userOptional.get().setEmail(user.getEmail());
    }
}

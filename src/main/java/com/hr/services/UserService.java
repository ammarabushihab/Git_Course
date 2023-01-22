package com.hr.services;

import com.hr.model.User;
import com.hr.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {


    @Autowired
    private UserRepository userRepository;


    public List<User> findAllUser() {

        return userRepository.findAll();
    }

    public User findById(long id) {
        return userRepository.findById(id).orElseThrow(null);
    }


    public void addUser(User user) {
        userRepository.save(user);
    }

    public  void updateUser(User user)
    {
        userRepository.save(user);

    }


    public void deleteUser(long id){

        userRepository.deleteById(id);
    }
    }
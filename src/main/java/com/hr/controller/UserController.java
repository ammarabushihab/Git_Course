package com.hr.controller;

import com.hr.model.User;
import com.hr.services.UserService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class UserController {
    @Autowired
    private UserService userService;


    @GetMapping("/user")
    public List<User> getAllUsers(){

        return userService.findAllUser();
    }

    @GetMapping("/userbyid")
    public  User getUserById(@RequestParam long id){
      return userService.findById(id);

    }
@PostMapping("/user")
    public ResponseEntity<User> addUser(@Valid @RequestBody User user){
        userService.addUser(user);
    return new ResponseEntity<User>(user, HttpStatus.OK);
    }

    @PutMapping("/user")
    public ResponseEntity<User> updateUser(@Valid @RequestBody User user){
        userService.updateUser(user);
        return new ResponseEntity<User>(user,HttpStatus.OK);
    }

    @DeleteMapping("/user")

    public String deleteUser(@RequestParam long Id){

        userService.deleteUser(Id);

return "Deleted Successfully";    }
}

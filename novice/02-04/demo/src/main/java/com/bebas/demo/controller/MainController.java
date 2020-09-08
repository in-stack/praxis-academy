package com.bebas.demo.controller;

import com.bebas.demo.model.User;
import com.bebas.demo.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller 
@RequestMapping(path="/demo")
public class MainController {
    @Autowired
    private UserRepository userRepository;
   
@PostMapping(path="/add") // Map ONLY POST Requests
public @ResponseBody User addNewUser(@RequestBody User user) {  
    return userRepository.save(user);
}
@GetMapping(path="/all")
public @ResponseBody Iterable<User> getAlllUsers() {
    return userRepository.findAll();

    }
@DeleteMapping("/delete/{id}")
public void deleteUser(@PathVariable Integer id){
    userRepository.deleteById(id);
}
@PutMapping("/update/{id}")
User updatedUser(@RequestBody User newUser, @PathVariable Integer id){
 
    return userRepository.findById(id)
    .map(user -> {
        user.setName(newUser.getName());
        user.setEmail(newUser.getEmail());
        return userRepository.save(user);
      })
      .orElseGet(() -> {
        newUser.setId(id);
        return userRepository.save(newUser);
      });
  }
   
}

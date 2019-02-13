package com.tubehelps.Rest.controllers;

import com.tubehelps.Rest.domain.UserDTO;
import com.tubehelps.Rest.services.UserServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Created by ASUS on 2/11/2019.
 */

@RestController
@RequestMapping("/user")
public class User {

    @Autowired
    private UserServices userServices;

    @GetMapping("/all")
    public List<UserDTO> allUsers(){
        return userServices.findAllUsers();
    }

    @PostMapping("/add")
    public String addUser(@RequestBody UserDTO UserData){

        return userServices.saveUser(UserData);
    }


    @PutMapping("/update")
    public String updateUser(@RequestBody UserDTO newUserData){
        return userServices.updateUser(newUserData);

    }

    @GetMapping("/find/{id}")
    public UserDTO getUserById(@PathVariable Integer id){

        return userServices.findById(id);
    }




}












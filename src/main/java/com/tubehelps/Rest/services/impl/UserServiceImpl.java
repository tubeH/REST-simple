package com.tubehelps.Rest.services.impl;

import com.tubehelps.Rest.domain.UserDTO;
import com.tubehelps.Rest.repositories.UserRepository;
import com.tubehelps.Rest.services.UserServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by ASUS on 2/11/2019.
 */
@Service

//spring boot identify the UserServiceImpl as a service which have to execute logics in this application
public class UserServiceImpl implements UserServices{

    @Autowired
    private UserRepository userRepository;

    @Override
    public String updateUser(UserDTO newUserData) {
        String msg = null;
        if(newUserData.getId()!= null){
            userRepository.save(newUserData);
            msg="Data Updated";
        }else{
            msg="User Not Found..!";
        }
        return msg;
    }

    @Override
    public List<UserDTO> findAllUsers() {

        //database search
        //return all users
        List<UserDTO> allUsers =userRepository.findAll();
        return allUsers;

    }

    @Override
    public String saveUser(UserDTO userData) {
        userRepository.save(userData);

        return "Data saved..!";
    }

    @Override
    public UserDTO findById(Integer id) {
       return userRepository.findOne(id);
    }
}













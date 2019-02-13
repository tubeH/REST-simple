package com.tubehelps.Rest.services;

/**
 * Created by ASUS on 2/11/2019.
 */
import com.tubehelps.Rest.domain.UserDTO;

import java.util.List;


public interface UserServices {
    
    List<UserDTO> findAllUsers();
    String saveUser(UserDTO userData);

    String updateUser(UserDTO newUserData);

    UserDTO findById(Integer id);
}

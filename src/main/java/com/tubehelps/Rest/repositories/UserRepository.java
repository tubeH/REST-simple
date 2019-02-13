package com.tubehelps.Rest.repositories;

import com.tubehelps.Rest.domain.UserDTO;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by ASUS on 2/11/2019.
 */
public interface UserRepository extends JpaRepository<UserDTO,Integer>{
    UserDTO findOne(Integer id);


    //getAllUsers
    //findById
    //update
    //custom query

}

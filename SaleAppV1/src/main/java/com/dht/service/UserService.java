/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.dht.service;

<<<<<<< HEAD
import com.dht.pojo.User;
import java.util.Map;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.web.multipart.MultipartFile;
=======
import org.springframework.security.core.userdetails.UserDetailsService;
>>>>>>> d1ce47b755de74e350e80f0ab8bb10f31db8bc68

/**
 *
 * @author admin
 */
public interface UserService extends UserDetailsService  {
<<<<<<< HEAD
    User getUserByUn(String username);
    boolean authUser(String username, String password);
    User addUser(Map<String, String> params, MultipartFile avatar);
=======
    
>>>>>>> d1ce47b755de74e350e80f0ab8bb10f31db8bc68
}

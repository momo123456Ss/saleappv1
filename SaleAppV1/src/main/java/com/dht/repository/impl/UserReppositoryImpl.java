/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.dht.repository.impl;

import com.dht.pojo.User;
import com.dht.repository.UserReppository;
import org.hibernate.Session;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.LocalSessionFactoryBean;
<<<<<<< HEAD
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
=======
>>>>>>> d1ce47b755de74e350e80f0ab8bb10f31db8bc68
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author admin
 */
@Repository
@Transactional
public class UserReppositoryImpl implements UserReppository {

    @Autowired
    private LocalSessionFactoryBean factory;
<<<<<<< HEAD
    @Autowired
    private BCryptPasswordEncoder passEncoder;
=======
>>>>>>> d1ce47b755de74e350e80f0ab8bb10f31db8bc68

    @Override
    public User getUserByUsername(String username) {
        Session s = this.factory.getObject().getCurrentSession();
        Query q = s.createQuery("FROM User WHERE username=:un");
        q.setParameter("un", username);

        return (User) q.getSingleResult();
    }

<<<<<<< HEAD
    @Override
    public boolean authUser(String username, String password) {
        User  u = this.getUserByUsername(username);
        
        return this.passEncoder.matches(password, u.getPassword());
    }

    @Override
    public User addUser(User u) {
        Session s = this.factory.getObject().getCurrentSession();
        s.save(u);
        
        return u;
    }

=======
>>>>>>> d1ce47b755de74e350e80f0ab8bb10f31db8bc68
}

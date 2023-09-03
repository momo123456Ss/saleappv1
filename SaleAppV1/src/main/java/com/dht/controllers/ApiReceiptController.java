/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.dht.controllers;

import com.dht.pojo.Cart;
import com.dht.service.ReceiptService;
import java.util.Map;
import org.springframework.beans.factory.annotation.Autowired;
<<<<<<< HEAD
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
=======
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
>>>>>>> d1ce47b755de74e350e80f0ab8bb10f31db8bc68
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author admin
 */
@RestController
@RequestMapping("/api")
public class ApiReceiptController {
    @Autowired
    private ReceiptService receiptService;
    
<<<<<<< HEAD
    @PostMapping("/pay/")
    @ResponseStatus(HttpStatus.OK)
    @CrossOrigin
=======
    @PostMapping("/pay")
>>>>>>> d1ce47b755de74e350e80f0ab8bb10f31db8bc68
    public void add(@RequestBody Map<String, Cart> carts) {
        this.receiptService.addReceipt(carts);
    }
}

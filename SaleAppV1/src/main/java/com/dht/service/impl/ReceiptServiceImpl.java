/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.dht.service.impl;

import com.dht.pojo.Cart;
<<<<<<< HEAD
import com.dht.repository.ReceiptRepository;
=======
>>>>>>> d1ce47b755de74e350e80f0ab8bb10f31db8bc68
import com.dht.service.ReceiptService;
import java.util.Map;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author admin
 */
@Service
public class ReceiptServiceImpl implements ReceiptService {
    @Autowired
<<<<<<< HEAD
    private ReceiptRepository receiptRepo;

    @Override
    public boolean addReceipt(Map<String, Cart> carts) {
        return this.receiptRepo.addReceipt(carts);
=======
    private ReceiptService receiptService;

    @Override
    public boolean addReceipt(Map<String, Cart> carts) {
        return this.receiptService.addReceipt(carts);
>>>>>>> d1ce47b755de74e350e80f0ab8bb10f31db8bc68
    }
    
}

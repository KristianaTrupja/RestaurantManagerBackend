package com.protik.JavaFinalProject.controller;

import com.protik.JavaFinalProject.model.OrderEntity;
import com.protik.JavaFinalProject.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/order")
public class OrderController {
    @Autowired
    private OrderService orderService;

    @PostMapping("/add")
    public String add(@RequestBody OrderEntity order){
        orderService.saveOrder(order);
        return "New order is added";
    }

    @GetMapping("/getAll")
    public List<OrderEntity> getAllOrders(){
        return orderService.getAllOrders();
    };
}

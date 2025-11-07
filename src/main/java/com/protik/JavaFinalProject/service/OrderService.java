package com.protik.JavaFinalProject.service;

import com.protik.JavaFinalProject.model.OrderEntity;

import java.util.List;

public interface OrderService {
    public OrderEntity saveOrder(OrderEntity order);
    public List<OrderEntity> getAllOrders();
}

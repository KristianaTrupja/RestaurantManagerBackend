package com.protik.JavaFinalProject.model;

import jakarta.persistence.*;

@Entity
@Table(name = "`order`")
public class OrderEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "order_name")
    private String orderName;

    public OrderEntity(int id, String orderName) {
        this.id = id;
        this.orderName = orderName;
    }

    public OrderEntity() {}

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getOrderName() {
        return orderName;
    }

    public void setOrderName(String orderName) {
        this.orderName = orderName;
    }
}

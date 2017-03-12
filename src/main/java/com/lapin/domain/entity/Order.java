package com.lapin.domain.entity;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "orders")
public class Order {
    @Id
    @GeneratedValue
    private Long orderId;

    @Column(name = "memberId")
    private Long memberId;

//    @Column(name = "orderItems")
//    private List<Item> orderItems;

    @Column(name = "orderDate")
    private Date orderDate;

    @Column(name = "orderStatus")
    private OrderStatus orderStatus;
}

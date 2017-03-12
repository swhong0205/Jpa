package com.lapin.domain.entity;

import javax.persistence.*;

@Entity
@Table(name = "order_items")
public class OrderItem {
    @Id
    @GeneratedValue
    private Long orderItemId;
    @Column(name = "orderId")
    private Long order;
    @Column(name = "itemIditemId")
    private Long itemId;
    @Column(name = "orderPrice")
    private Integer orderPrice;
    @Column(name = "count")
    private Integer count;
}

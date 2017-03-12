package com.lapin.domain.entity;

import javax.persistence.*;

@Entity
@Table(name = "members")
public class Member {
    @Id
    @GeneratedValue
    private Long memberId;

    @Column(name = "name")
    private String name;

    @Column(name = "city")
    private String city;

    @Column(name = "zipcode")
    private String zipcode;
//
//    @Column(name = "orders")
//    private List<Order> orders;
}

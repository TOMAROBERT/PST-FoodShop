package com.example.demo.model;

import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name = "foodOrder")
@SequenceGenerator(name = "foodOrder_secv" ,initialValue = 1 ,allocationSize = 99)
@Data


public class FoodOrder {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE , generator = "foodOrder_secv")
    @Column(name = "OrderID")
    private Integer orderId;
    @Column(name = "Produse")
    private String produse;
    @Column(name = "Cantitate")
    private Integer cantitate;
}

package com.example.demo.model;


import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name = "foodMenu")
@SequenceGenerator(name = "foodMenu_secv" ,initialValue = 2 ,allocationSize = 99)
@Data

public class FoodMenu {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE , generator = "foodMenu_secv")
    @Column(name = "FoodID")
    private Integer foodId;
    @Column(name = "DenumireProd")
    private String denumireProd;
    @Column(name = "Ingrediente")
    private String ingrediente;
    @Column(name = "Pret")
    private Integer pret;


    @ManyToOne(cascade=CascadeType.DETACH)
    private FoodOrder foodOrder;
}

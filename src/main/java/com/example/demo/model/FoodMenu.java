package com.example.demo.model;


import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name = "foodMenu")
@SequenceGenerator(name = "foodMenu_secv" ,initialValue = 1 ,allocationSize = 99)
@Data

public class FoodMenu {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE , generator = "foodMenu_secv")
    @Column(name = "FoodID")
    private Integer FoodID;
    @Column(name = "DenumireProd")
    private String DenumireProd;
    @Column(name = "Ingrediente")
    private String Ingrediente;
    @Column(name = "Pret")
    private Integer Pret;

    @ManyToOne
    private FoodOrder foodOrder;
}

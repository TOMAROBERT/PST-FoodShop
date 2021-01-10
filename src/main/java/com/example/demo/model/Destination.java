package com.example.demo.model;


import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name = "destination")
@SequenceGenerator(name = "destionation_secv" ,initialValue = 1 ,allocationSize = 99)
@Data

public class Destination {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE , generator = "destionation_secv")
    @Column(name = "AdressID")
    private Integer AdressID;
    @Column(name = "Adresa")
    private String Adresa;
    @Column(name = "Locatie")
    private String Locatie;
}

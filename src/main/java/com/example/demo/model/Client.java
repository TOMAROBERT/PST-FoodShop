package com.example.demo.model;

import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name = "client")
@SequenceGenerator(name = "client_secv" ,initialValue = 1 ,allocationSize = 99)
@Data

public class Client {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE , generator = "client_secv")
    @Column(name = "UserID")
    private Integer UserID;
    @Column(name = "Email")
    private String Email;
    @Column(name = "Parola")
    private String Parola;
    @Column(name = "Telefon")
    private Integer Telefon;
}

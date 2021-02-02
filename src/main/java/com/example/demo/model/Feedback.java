package com.example.demo.model;

import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name = "feedback")
@SequenceGenerator(name = "feedback_secv" , allocationSize = 1)
@Data


public class Feedback {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE , generator = "feedback_secv")
    @Column(name = "FeedbackID")
    private Integer feedbackId;
    @Column(name = "Apreciere")
    private Integer apreciere;
    @Column(name = "Detalii")
    private String detalii;
}

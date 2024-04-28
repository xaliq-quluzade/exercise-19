package com.example.exercise19.model;

import jakarta.persistence.*;

import java.util.Date;

@Entity
public class StudentIDCard {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int cardId;

    private String cardNumber;
    private Date expiryDate;

    @OneToOne(mappedBy = "studentIDCard")
    private Student student;
}

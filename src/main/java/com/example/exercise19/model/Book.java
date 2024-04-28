package com.example.exercise19.model;

import jakarta.persistence.*;

import java.util.List;

@Entity
public class Book {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int bookId;

    private String title;
    private String author;

    @OneToMany(mappedBy = "book")
    private List<Professor> professor;
}

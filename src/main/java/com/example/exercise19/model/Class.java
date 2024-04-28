package com.example.exercise19.model;

import jakarta.persistence.*;

import java.util.List;

@Entity
public class Class {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int classId;

    private String className;

    @ManyToMany(mappedBy = "classes")
    private List<Student> students;
}

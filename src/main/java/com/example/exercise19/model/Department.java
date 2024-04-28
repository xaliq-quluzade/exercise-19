package com.example.exercise19.model;

import jakarta.persistence.*;

import java.util.List;

@Entity
public class Department {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int departmentId;

    private String departmentName;

    @OneToMany(mappedBy = "department")
    private List<Professor> professor;
}

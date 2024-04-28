package com.example.exercise19.model;

import jakarta.persistence.*;

import java.util.List;

@Entity
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int studentId;
    private String firstName;
    private String lastName;

    @OneToOne
    @JoinColumn(name = "cardId")
    private StudentIDCard studentIDCard;

    @ManyToMany
    @JoinTable(name = "student_class", joinColumns = @JoinColumn(name = "studentId",unique = true),
                                        inverseJoinColumns = @JoinColumn(name = "classId",unique = true))
    private List<Class> classes;
}

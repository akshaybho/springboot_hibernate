package com.sms.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Entity // it is used to tell the hibernate this java class should be mapped to a table in DB
@Table(name = "student_info")
@Getter
@Setter
public class Student {

    @Id //marks the field a primary key
    @GeneratedValue(strategy = GenerationType.IDENTITY) //specifies autogeneration stratgies for primary key
    // and GenerationType.IDENTITY for auto-increment
    @Column //Specifies column name and properties
    private int id;
    @Column
    private int age;
    @Column
    private String name;

    @Transient // not saved in database
    private String status;

    @Embedded
    private Address address;

    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name="studnet_id") //foreign key in course table
    private List<Course> courses = new ArrayList<>();

    @ManyToOne
    @JoinColumn(name="college_id") //foreign key in student table
    private College college;

    @Override
    public String toString() {
        return "Student{id=" + id + ", name='" + name + "', age=" + age + '}';
    }
}

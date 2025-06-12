package com.sms.model;

import jakarta.persistence.*;

@Entity // it is used to tell the hibernate this java class should be mapped to a table in DB
@Table(name = "student_info")
public class Student {


    @Id //marks the field a primary key
    @GeneratedValue(strategy = GenerationType.IDENTITY) //specifies autogeneration stratgies for primary key
    // and GenerationType.IDENTITY for auto-increment
    @Column //Specifies column name and properties
    private int id;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Column
    private int age;
    @Column
    private String name;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }


    @Override
    public String toString() {
        return "Student{id=" + id + ", name='" + name + "', age=" + age + '}';
    }
}

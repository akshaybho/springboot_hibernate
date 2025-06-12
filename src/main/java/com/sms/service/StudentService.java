package com.sms.service;

import com.sms.model.Student;

import java.util.List;

public interface StudentService {

    List<Student> get();

    Student get(int id);

    void save(Student std);

    void delete(int id);
}

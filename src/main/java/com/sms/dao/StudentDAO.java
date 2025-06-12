package com.sms.dao;

import com.sms.model.Student;

import java.util.List;

public interface StudentDAO {

    List <Student> get();

    Student get(int id);

    void save(Student std);

    void delete(int id);
}

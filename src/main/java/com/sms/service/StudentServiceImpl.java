package com.sms.service;

import com.sms.dao.StudentDAO;
import com.sms.model.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class StudentServiceImpl implements StudentService{

    @Autowired
    private StudentDAO stdDAO;
    @Transactional // if anything fails here, DB changes will be rolled back automatically
    @Override
    public List<Student> get() {

        return stdDAO.get();
    }

    @Transactional
    @Override
    public Student get(int id) {
        return stdDAO.get(id);
    }

    @Transactional
    @Override
    public void save(Student std) {

        stdDAO.save(std);
    }

    @Transactional
    @Override
    public void delete(int id) {

        stdDAO.delete(id);
    }
}

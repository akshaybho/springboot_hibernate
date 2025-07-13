package com.sms.service;

import com.sms.dao.CourseDao;
import com.sms.model.Course;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CourseServiceImpl implements CourseService{

    @Autowired
    private CourseDao courseDao;

    @Override
    public List<Course> getAllCourses() {

        return courseDao.getAllCourses();
    }
}

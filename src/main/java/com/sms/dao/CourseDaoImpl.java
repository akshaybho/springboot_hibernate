package com.sms.dao;

import com.sms.model.Course;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public class CourseDaoImpl implements CourseDao{

    @PersistenceContext
    private EntityManager em;

    @Override
    public List<Course> getAllCourses() {

        return em.createQuery("FROM Course", Course.class).getResultList();
    }
}

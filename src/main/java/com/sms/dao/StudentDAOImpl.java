package com.sms.dao;


import jakarta.persistence.EntityManager;
import com.sms.model.Student;
import org.hibernate.Session;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class StudentDAOImpl implements StudentDAO{

    @Autowired
    private EntityManager entityManager;

    //EntityManager: used to manage the lifecycle of entity objects and perform database operations like:
    /*
    1) persist(entity)  Inserts a new object into the database
    2) find(Class, id)	Retrieves an entity by primary key
    3) merge(entity)	Updates an existing entity (or inserts if it doesn't exist)
    4) remove(entity)	Deletes an entity from the database
    5) createQuery(query)	Executes a JPQL (Java Persistence Query Language) query
    6) clear()	Detaches all managed entities
    7) getTransaction()	  Begins/commits/rollbacks a transaction (outside Spring)
     */

    @Override
    public List<Student> get() {

        //Session : It is main Interface used for -> 1)Connect to the database
        //2)Perform CRUD operations (Create, Read, Update, Delete)
        //3)Manage transactions 4)Map Java objects to database rows
       Session currentSession = entityManager.unwrap(Session.class);

       Query <Student> query = currentSession.createQuery("from Student", Student.class);
       //Query
       List <Student> list = query.getResultList();
       return list;
    }

    @Override
    public Student get(int id) {

        Session currentSession = entityManager.unwrap(Session.class);
        Student stdObj = currentSession.get(Student.class, id);
        return stdObj;
    }

    @Override
    public void save(Student std) {

        Session currentSession = entityManager.unwrap(Session.class);
        currentSession.save(std);
    }

    @Override
    public void delete(int id) {

        Session currentSession = entityManager.unwrap(Session.class);
        Student stdObj = currentSession.get(Student.class, id);
        currentSession.delete(stdObj);
    }
}

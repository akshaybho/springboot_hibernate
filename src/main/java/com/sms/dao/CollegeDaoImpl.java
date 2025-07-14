package com.sms.dao;

import com.sms.model.College;
import jakarta.persistence.EntityManager;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;


import java.util.List;

@Repository
public class CollegeDaoImpl implements CollegeDao{

    @Autowired
    private EntityManager entityManager;

    @Override
    public void addCollege(College college) {

        Transaction tx = null;
        try(Session session = new Configuration().configure().buildSessionFactory().openSession())
        {
            tx = session.beginTransaction();
            session.persist(college);
            tx.commit();
            System.out.println("College saved successfully");
        }
        catch(Exception e)
        {
            if(tx!=null)
            {
                tx.rollback();
                e.printStackTrace();
            }
        }
    }

    @Override
    public List<College> getAllCollege() {

        Session session = entityManager.unwrap(Session.class);

        Query<College> query = session.createQuery("FROM college", College.class);

        return query.getResultList();
    }
}

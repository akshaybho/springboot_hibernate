package com.sms.service;

import com.sms.dao.CollegeDao;
import com.sms.model.College;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class CollegeServiceImpl implements CollegeService{

    @Autowired
    private CollegeDao collegeDao;

    @Override
    public void addCollege(College college) {

        collegeDao.addCollege(college);
    }

    @Override
    public List<College> getAllCollege() {

        return collegeDao.getAllCollege();
    }
}

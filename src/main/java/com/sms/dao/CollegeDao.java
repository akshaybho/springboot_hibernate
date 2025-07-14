package com.sms.dao;

import com.sms.model.College;

import java.util.List;

public interface CollegeDao {

    void addCollege(College collge);

    List<College> getAllCollege();
}

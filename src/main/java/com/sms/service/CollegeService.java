package com.sms.service;

import com.sms.model.College;

import java.util.List;

public interface CollegeService {

    void addCollege(College college);

    List<College> getAllCollege();
}

package com.sms.controller;

import com.sms.model.College;
import com.sms.service.CollegeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/college")
public class CollegeController {

    @Autowired
    private CollegeService collegeService;

    @PostMapping("/clg")
    public College save(@RequestBody College clg)
    {
        collegeService.addCollege(clg);

        return clg;
    }

    @GetMapping
    public List<College> getAllColleges()
    {

        return collegeService.getAllCollege();
    }
}

package com.sms.controller;

import com.sms.model.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.sms.service.StudentService;

import java.util.List;

@RestController
@RequestMapping("/api")
public class StudentController {

    @Autowired
    private StudentService stdService;

    @GetMapping("/student")
    public List<Student> get()
    {
        return stdService.get();
    }
    @PostMapping("/student")
    public Student save(@RequestBody Student stdObj)
    {
         stdService.save(stdObj);

         return stdObj;
    }

    @GetMapping("/student/{id}")
    public Student getById(@PathVariable int id)
    {
        return stdService.get(id);
    }

    @DeleteMapping("/student/{id}")
    public String deleteById(@PathVariable int id)
    {
        stdService.delete(id);
        return "Student has been deleted with id:"+id;
    }

}

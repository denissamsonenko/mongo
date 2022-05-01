package com.example.mongo.controller;

import com.example.mongo.model.Student;
import com.example.mongo.service.StudentService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @author : Denis Samsonenko
 * @created : 01.05.2022
 */

@RestController
@RequestMapping("api/v1/student")
@AllArgsConstructor
public class StudentController {

    private final StudentService studentService;

    @GetMapping
    public List<Student> fetchAllStudent(){
        return studentService.getAllStudents();
    }

    @PostMapping
    public void createStudent(@RequestBody Student student) {
        studentService.createStudent(student);
    }
}

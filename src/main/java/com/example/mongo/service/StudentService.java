package com.example.mongo.service;

import com.example.mongo.model.Student;

import java.util.List;

/**
 * @author : Denis Samsonenko
 * @created : 01.05.2022
 */
public interface StudentService {
    List<Student> getAllStudents();

    void createStudent(Student student);
}

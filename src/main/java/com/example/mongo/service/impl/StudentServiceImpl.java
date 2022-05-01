package com.example.mongo.service.impl;

import com.example.mongo.model.Student;
import com.example.mongo.repo.StudentRepository;
import com.example.mongo.service.StudentService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;

/**
 * @author : Denis Samsonenko
 * @created : 01.05.2022
 */

@Service
@AllArgsConstructor
public class StudentServiceImpl implements StudentService {

    private final StudentRepository studentRepository;

    @Override
    public List<Student> getAllStudents() {
        return studentRepository.findAll();
    }

    @Override
    public void createStudent(Student student) {
        student.setCreated(LocalDateTime.now());
        studentRepository.insert(student);
    }
}

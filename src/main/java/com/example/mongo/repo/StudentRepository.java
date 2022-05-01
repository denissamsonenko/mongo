package com.example.mongo.repo;

import com.example.mongo.model.Student;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

/**
 * @author : Denis Samsonenko
 * @created : 01.05.2022
 */

@Repository
public interface StudentRepository extends MongoRepository<Student, String> {
}

package com.example.mongo.model;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.format.annotation.DateTimeFormat;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.List;

/**
 * @author : Denis Samsonenko
 * @created : 01.05.2022
 */

@Data
@Document
public class Student {
    @Id
    private String id;
    private String firstName;
    private String lastName;
    private Gender gender;
    @Indexed(unique = true)
    private String email;
    private Address address;
    private List<String> subject;
    private BigDecimal totalSpentOnBooks;
    @DateTimeFormat(pattern = "dd.MM.yyyy HH:mm:ss")
    private LocalDateTime created;
}

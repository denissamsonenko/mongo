package com.example.mongo.model;

import lombok.Data;

/**
 * @author : Denis Samsonenko
 * @created : 01.05.2022
 */

@Data
public class Address {
    private String country;
    private String city;
    private String postCode;
}

package com.employee.backend.rest.controller;

import com.employee.backend.model.entity.BirthCity;
 import com.employee.backend.repository.BirthCityRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin(origins = "http://localhost:4000")
@RestController
@RequestMapping("/birthCity")
public class BirthCityApi {
    @Autowired
    BirthCityRepo birthCityRepo;

    @GetMapping("/getAllCities")
    public Iterable<BirthCity> viewAllCity() {
        return birthCityRepo.findAll();
    }
}

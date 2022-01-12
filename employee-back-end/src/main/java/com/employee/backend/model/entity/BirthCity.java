package com.employee.backend.model.entity;

import com.employee.backend.model.enums.EBirthCity;
import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.util.List;

@Entity
public class BirthCity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY )
    private Long id;

     private String birthCity;

    @OneToMany(mappedBy = "birthCity")
    @JsonIgnore
    private List<Employee> employees;


    public BirthCity() {
    }

    public BirthCity(String birthCity) {
        this.birthCity = birthCity;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getBirthCity() {
        return birthCity;
    }

    public void setBirthCity(String birthCity) {
        this.birthCity = birthCity;
    }
}

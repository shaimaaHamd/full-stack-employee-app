package com.employee.backend.model.entity;

import com.employee.backend.model.enums.EContractType;
 import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.util.List;

@Entity
public class ContractType {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY )
    private Long id;

     private String contractType;

    @OneToMany(mappedBy = "contractType")
    @JsonIgnore
    private List<Employee> employees;


    public ContractType() {
    }

    public ContractType(String contractType) {
        this.contractType = contractType;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getContractType() {
        return contractType;
    }

    public void setContractType(String contractType) {
        this.contractType = contractType;
    }

    public List<Employee> getEmployees() {
        return employees;
    }

    public void setEmployees(List<Employee> employees) {
        this.employees = employees;
    }
}

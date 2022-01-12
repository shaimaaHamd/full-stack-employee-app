package com.employee.backend.model;

import com.employee.backend.model.entity.BirthCity;
import com.employee.backend.model.entity.ContractType;
import com.employee.backend.model.entity.Department;
import com.employee.backend.model.entity.Status;

import javax.persistence.*;
import java.time.LocalDate;

public class EmployeeModel {

    private Long id;

     private String employeeCode;

    private String name;
    private LocalDate birthDate;


    private Long birthCityId;


    private Long departmentId;

    private String jobTitle;
    private String directManger;


    private Long contractTypeId;

    private Long statusId;

    public EmployeeModel() {
    }



    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getEmployeeCode() {
        return employeeCode;
    }

    public void setEmployeeCode(String employeeCode) {
        this.employeeCode = employeeCode;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(LocalDate birthDate) {
        this.birthDate = birthDate;
    }

    public Long getBirthCityId() {
        return birthCityId;
    }

    public void setBirthCityId(Long birthCityId) {
        this.birthCityId = birthCityId;
    }

    public Long getDepartmentId() {
        return departmentId;
    }

    public void setDepartmentId(Long departmentId) {
        this.departmentId = departmentId;
    }

    public String getJobTitle() {
        return jobTitle;
    }

    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }

    public String getDirectManger() {
        return directManger;
    }

    public void setDirectManger(String directManger) {
        this.directManger = directManger;
    }

    public Long getContractTypeId() {
        return contractTypeId;
    }

    public void setContractTypeId(Long contractTypeId) {
        this.contractTypeId = contractTypeId;
    }

    public Long getStatusId() {
        return statusId;
    }

    public void setStatusId(Long statusId) {
        this.statusId = statusId;
    }
}

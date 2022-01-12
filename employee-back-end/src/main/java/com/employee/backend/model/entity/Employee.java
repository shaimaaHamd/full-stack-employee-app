package com.employee.backend.model.entity;


import com.employee.backend.model.EmployeeModel;
import com.employee.backend.model.enums.EBirthCity;
import com.employee.backend.model.enums.EContractType;
import com.employee.backend.model.enums.EDepartment;
import com.employee.backend.model.enums.EStatus;

import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDate;

@Entity
    public class Employee implements Serializable {
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private Long id;

       @Column(nullable = false, updatable = false)
        private String employeeCode;

        private String name;
        private LocalDate birthDate;

        @ManyToOne
        @JoinColumn(name = "birth_city_id")
        private BirthCity birthCity;

       @ManyToOne
       @JoinColumn(name = "department_id")
        private  Department department;

        private String jobTitle;
        private String directManger;

       @ManyToOne
       @JoinColumn(name = "contract_type_id")
        private   ContractType contractType;
    @ManyToOne
       @JoinColumn(name = "status_id")
        private  Status status;



        public Employee() {}

//       public Employee(EmployeeModel model) {
//            this.id = model.getId();
//        this.employeeCode = model.getEmployeeCode();
//        this.name = model.getName();
//        this.birthDate = model.getBirthDate();
//        this.birthCity.setId(model.getBirthCityId());
//        this.department.setId(model.getDepartmentId());
//        this.jobTitle =  model.getJobTitle();
//        this.directManger = model.getDirectManger();
//        this.contractType = new ContractType();
//        this.status = new Status();
//    }

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

    public BirthCity getBirthCity() {
        return birthCity;
    }

    public void setBirthCity(BirthCity birthCity) {
        this.birthCity = birthCity;
    }

    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department) {
        this.department = department;
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

    public ContractType getContractType() {
        return contractType;
    }

    public void setContractType(ContractType contractType) {
        this.contractType = contractType;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

}


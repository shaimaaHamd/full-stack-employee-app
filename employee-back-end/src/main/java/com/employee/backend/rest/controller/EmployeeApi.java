package com.employee.backend.rest.controller;

import com.employee.backend.model.EmployeeModel;
import com.employee.backend.model.entity.Employee;
import com.employee.backend.repository.EmployeeRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.ArrayList;
import java.util.List;

@CrossOrigin(origins = "http://localhost:4000")
@RestController
@RequestMapping("/employee")
public class EmployeeApi {

    @Autowired
    EmployeeRepo employeeRepo;


    @GetMapping("/getAllEmployees")
    public Iterable<Employee> viewAllEmployees() {
        return employeeRepo.findAll();
    }

    @GetMapping("/getById/{id}")
    public  Employee viewById(@PathVariable("id") long id) {
        return employeeRepo.findById(id).get();
    }

    @PostMapping( path ="/createEmployee",consumes = "application/json")
    @ResponseStatus(HttpStatus.CREATED)
    public Employee addEmployee(@RequestBody Employee  employee) {

        return employeeRepo.save(employee);
    }

    @PatchMapping( path ="/updateById",consumes = "application/json")
    @ResponseStatus(HttpStatus.CREATED)
    public Employee updateEmployee(@RequestBody Employee employee) {
        return employeeRepo.save(employee);
    }

    @DeleteMapping("deleteById/{id}")
    @ResponseStatus(HttpStatus.ACCEPTED)
     public void deleteBook (@PathVariable("id") long id) {
        employeeRepo.deleteById(id);
     }
}

package com.employee.backend.rest.controller;

 import com.employee.backend.model.entity.Department;
 import com.employee.backend.repository.DepartmentRepo;
import org.springframework.beans.factory.annotation.Autowired;
 import org.springframework.web.bind.annotation.CrossOrigin;
 import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin(origins = "http://localhost:4000")
@RestController
@RequestMapping("/department")
public class DepartmentApi {
    @Autowired
    DepartmentRepo departmentRepo;

    @GetMapping("/getAllDepartments")
    public Iterable<Department> viewAllDepartments() {
        return departmentRepo.findAll();
    }
}

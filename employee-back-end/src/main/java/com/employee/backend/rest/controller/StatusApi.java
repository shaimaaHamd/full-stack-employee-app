package com.employee.backend.rest.controller;

 import com.employee.backend.model.entity.Status;
 import com.employee.backend.repository.StatusRepo;
import org.springframework.beans.factory.annotation.Autowired;
 import org.springframework.web.bind.annotation.CrossOrigin;
 import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@CrossOrigin(origins = "http://localhost:4000")
@RestController
@RequestMapping("/status")
public class StatusApi {
    @Autowired
    StatusRepo statusRepo;

    @GetMapping("/getAllStatus")
    public Iterable<Status> viewAllStatus() {
        return statusRepo.findAll();
    }
}

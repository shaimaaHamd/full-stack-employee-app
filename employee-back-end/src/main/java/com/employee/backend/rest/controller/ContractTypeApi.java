package com.employee.backend.rest.controller;

import com.employee.backend.model.entity.ContractType;
import com.employee.backend.repository.ContractTypeRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@CrossOrigin(origins = "http://localhost:4000")
@RestController
@RequestMapping("/contractType")
public class ContractTypeApi {
    @Autowired
    ContractTypeRepo contractTypeRepo;

    @GetMapping("/getAllTypes")
    public Iterable<ContractType> viewAllTypes() {
        return contractTypeRepo.findAll();
    }
}

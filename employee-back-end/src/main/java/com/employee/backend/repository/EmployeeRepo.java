package com.employee.backend.repository;

import com.employee.backend.model.entity.Employee;
 import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public interface EmployeeRepo extends JpaRepository<Employee, Long> {

}

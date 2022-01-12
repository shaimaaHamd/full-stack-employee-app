package com.employee.backend.repository;

import com.employee.backend.model.entity.Department;
 import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface DepartmentRepo extends JpaRepository<Department, Long> {
}

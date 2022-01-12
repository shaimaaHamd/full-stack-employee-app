package com.employee.backend.repository;


import com.employee.backend.model.entity.BirthCity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BirthCityRepo extends JpaRepository<BirthCity, Long> {
}

package com.example.ThymeleafExample.repo;

import com.example.ThymeleafExample.entities.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Employee,Integer> {
}

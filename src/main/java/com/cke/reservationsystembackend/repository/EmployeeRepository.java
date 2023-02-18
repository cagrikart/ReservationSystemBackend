package com.cke.reservationsystembackend.repository;

import com.cke.reservationsystembackend.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Employee,Long> {
}

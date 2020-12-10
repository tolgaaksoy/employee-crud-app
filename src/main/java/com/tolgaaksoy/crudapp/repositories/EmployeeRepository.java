package com.tolgaaksoy.crudapp.repositories;

import com.tolgaaksoy.crudapp.models.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Employee,Long> {
    Employee findByName(String name);
}

package com.tolgaaksoy.crudapp.services;

import com.tolgaaksoy.crudapp.dto.EmployeeDto;

import java.util.List;

public interface EmployeeService {
    EmployeeDto addEmployee(EmployeeDto employeeDto);
    EmployeeDto updateEmployee(EmployeeDto employeeDto);
    void deleteEmployee(long employeeId);
    EmployeeDto getEmployee(long employeeId);
    List<EmployeeDto> getEmployees();
    EmployeeDto getByEmployeeName(String employeeName);
}

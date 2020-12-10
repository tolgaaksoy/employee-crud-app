package com.tolgaaksoy.crudapp.services;

import com.tolgaaksoy.crudapp.dto.EmployeeDto;
import com.tolgaaksoy.crudapp.mapper.EmployeeMapper;
import com.tolgaaksoy.crudapp.models.Employee;
import com.tolgaaksoy.crudapp.repositories.EmployeeRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class EmployeeServiceImpl implements EmployeeService {

    private final EmployeeRepository employeeRepository;
    private final EmployeeMapper employeeMapper;

    @Override
    public EmployeeDto addEmployee(EmployeeDto employeeDto) {
        return employeeMapper.toEmployeeDto(employeeRepository.save(employeeMapper.toEmployee(employeeDto)));
    }

    @Override
    public EmployeeDto updateEmployee(EmployeeDto employeeDto) {
        Employee employeeDb = employeeRepository.findById(employeeDto.getId())
                .orElseThrow(() -> new IllegalArgumentException("Employee : " + employeeDto.getId() + "does not exist !"));
        employeeDb.setName(employeeDto.getName());
        employeeDb.setLastName(employeeDto.getLastName());
        employeeDb.setEmail(employeeDto.getEmail());
        employeeDb.setPhoneNumber(employeeDto.getPhoneNumber());
        employeeDb.setSalary(employeeDto.getSalary());
        return employeeMapper.toEmployeeDto(employeeRepository.save(employeeDb));
    }

    @Override
    public void deleteEmployee(long id) {
        employeeRepository.delete(employeeRepository.findById(id).orElseThrow(() -> new IllegalArgumentException("Employee : " + id + "does not exist !")));
    }

    @Override
    public EmployeeDto getEmployee(long employeeId) {
        return employeeMapper
                .toEmployeeDto(employeeRepository
                        .findById(employeeId)
                        .orElseThrow(() -> new IllegalArgumentException("Employee : " + employeeId + "does not exist !")));
    }

    @Override
    public List<EmployeeDto> getEmployees() {
        return employeeMapper.toEmployeeDtoList(employeeRepository.findAll());
    }

    @Override
    public EmployeeDto getByEmployeeName(String employeeName) {
        return employeeMapper.toEmployeeDto(employeeRepository.findByName(employeeName));
    }
}

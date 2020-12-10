package com.tolgaaksoy.crudapp.mapper;

import com.tolgaaksoy.crudapp.dto.EmployeeDto;
import com.tolgaaksoy.crudapp.models.Employee;
import org.mapstruct.*;
import java.util.List;

@Mapper(componentModel = "spring")
public interface EmployeeMapper {
    @Named("toEmployee")
    Employee toEmployee(EmployeeDto employeeDto);

    @Named("toEmployeeDto")
    EmployeeDto toEmployeeDto(Employee employee);

    @IterableMapping(qualifiedByName = "toEmployee")
    List<Employee> toEmployeeList(List<EmployeeDto> employeeDtos);

    @IterableMapping(qualifiedByName = "toEmployeeDto")
    List<EmployeeDto> toEmployeeDtoList(List<Employee> employees);
}

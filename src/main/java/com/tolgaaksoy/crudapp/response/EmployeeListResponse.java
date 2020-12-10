package com.tolgaaksoy.crudapp.response;

import com.tolgaaksoy.crudapp.dto.EmployeeDto;
import lombok.Data;

import java.util.List;

@Data
public class EmployeeListResponse {
    private List<EmployeeDto> employeeDtoList;
}

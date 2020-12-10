package com.tolgaaksoy.crudapp.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@EqualsAndHashCode(callSuper=false)
@Data
@NoArgsConstructor
@AllArgsConstructor
public class EmployeeDto extends  BaseDto{
    private String name;
    private String lastName;
    private String phoneNumber;
    private String email;
    private int salary;
}

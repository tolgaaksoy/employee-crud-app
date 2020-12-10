package com.tolgaaksoy.crudapp.controller;

import com.tolgaaksoy.crudapp.request.EmployeeRequest;
import com.tolgaaksoy.crudapp.response.EmployeeListResponse;
import com.tolgaaksoy.crudapp.response.EmployeeResponse;
import com.tolgaaksoy.crudapp.services.EmployeeService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
@RequestMapping("api/employee/")
public class EmployeeController {

    private final EmployeeService employeeService;

    @GetMapping("{id}")
    public ResponseEntity<EmployeeResponse> getEmployee(@PathVariable(name = "id") long id){
        try {
            EmployeeResponse res = new EmployeeResponse();
            res.setEmployeeDto(employeeService.getEmployee(id));
            return ResponseEntity.ok(res);
        }catch (Exception e){
            e.printStackTrace();
            return new ResponseEntity(HttpStatus.NO_CONTENT);
        }
    }

    @GetMapping("list")
    public ResponseEntity<EmployeeListResponse> getEmployees(){
        try {
            EmployeeListResponse res = new EmployeeListResponse();
            res.setEmployeeDtoList(employeeService.getEmployees());
            return ResponseEntity.ok(res);
        }catch (Exception e){
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        }
    }

    @PostMapping
    public ResponseEntity<EmployeeResponse> addEmployee(@RequestBody EmployeeRequest req){
        try{
            EmployeeResponse res = new EmployeeResponse();
            res.setEmployeeDto(employeeService.addEmployee(req.getEmployeeDto()));
            return ResponseEntity.ok(res);
        }catch (Exception e){
            e.printStackTrace();
            return new ResponseEntity(HttpStatus.BAD_REQUEST);
        }
    }

    @PutMapping
    public ResponseEntity<EmployeeResponse> updateEmployee(@RequestBody EmployeeRequest req){
        try {
            EmployeeResponse res = new EmployeeResponse();
            res.setEmployeeDto(employeeService.updateEmployee(req.getEmployeeDto()));
            return ResponseEntity.ok(res);
        }catch (Exception e){
            return new ResponseEntity(HttpStatus.BAD_REQUEST);
        }
    }

    @DeleteMapping("{id}")
    public ResponseEntity deleteEmployee(@PathVariable(name = "id") long id){
        try{
            employeeService.deleteEmployee(id);
            return ResponseEntity.ok(HttpStatus.OK);
        }catch (Exception e){
            return new ResponseEntity(HttpStatus.NO_CONTENT);
        }
    }
}

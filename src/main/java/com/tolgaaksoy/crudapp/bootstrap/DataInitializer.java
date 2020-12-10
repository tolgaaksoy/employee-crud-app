package com.tolgaaksoy.crudapp.bootstrap;

import com.tolgaaksoy.crudapp.models.Employee;
import com.tolgaaksoy.crudapp.repositories.EmployeeRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@RequiredArgsConstructor
@Component
public class DataInitializer implements CommandLineRunner {

    private final EmployeeRepository employeeRepository;

    @Override
    public void run(String... args) throws Exception {
        loadData();
    }

    void loadData(){
        Employee employee1 = new Employee("Alan","Turing","31415926535","alantruing@mail.com",15000);
        Employee employee2 = new Employee("John","von Neumann","8979323846","johnvonneumann@mail.com",12000);
        Employee employee3 = new Employee("Ada","Lovelace","2643383279","adalovelace@mail.com",13000);

        employeeRepository.save(employee1);
        employeeRepository.save(employee2);
        employeeRepository.save(employee3);
    }

}

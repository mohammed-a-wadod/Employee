package com.example.demo;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeService {

    private final EmployeeRepository employeeRepository;

    public EmployeeService(EmployeeRepository employeeRepository) {
        this.employeeRepository = employeeRepository;
    }

    public List<Employee> retrieveAllEmployees() {
        return employeeRepository.findAll();
    }

    public Employee retrieveEmployeeById(long id) {
        return employeeRepository.findById(id);
    }

    public Employee saveEmployeeInfo(Employee emp) {
        return employeeRepository.save(emp);
    }

    public void deleteEmployeeById(long id) {
        employeeRepository.deleteById(id);
    }
}

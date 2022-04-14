package com.example.demo;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("employee")
public class EmployeeController {

    private final EmployeeService employeeService;

    public EmployeeController(EmployeeService employeeService) {
        this.employeeService = employeeService;
    }

    @GetMapping("/")
    public ResponseEntity<List<Employee>> retrieveAllEmployees() {
        List<Employee> employees = employeeService.retrieveAllEmployees();
        return ResponseEntity.ok(employees);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Employee> retrieveEmployeeById(@PathVariable("id") long id) {
        return ResponseEntity.ok(employeeService.retrieveEmployeeById(id));
    }

    @PostMapping("/")
    public ResponseEntity<Employee> saveEmployeeInfo(@RequestBody Employee employee) {
        return ResponseEntity.ok(employeeService.saveEmployeeInfo(employee));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<String> deleteEmployeeById(@PathVariable("id") long id) {
        employeeService.deleteEmployeeById(id);
        return ResponseEntity.ok("Employee was deleted successfully");
    }

}

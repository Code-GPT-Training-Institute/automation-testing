package com.codegpt.training.controller;

import com.codegpt.training.service.IEmployeeService;
import com.codegpt.training.vo.Employee;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("employee")
public class EmployeeController {

    private IEmployeeService employeeService;

    EmployeeController(IEmployeeService employeeService) {
        this.employeeService = employeeService;
    }

    @RequestMapping(path = "/get-all-employee")
    public List<Employee> getAllEmployee() {
        return this.employeeService.getAllEmployee();
    }

    @GetMapping(path = "{id}")
    public Employee getEmployeeById(@PathVariable int id) {
        return this.employeeService.getEmployeeById(id);
    }

    @PostMapping(consumes = MediaType.APPLICATION_JSON_VALUE)
    public String createEmployee(@RequestBody Employee employee) {
        this.employeeService.saveEmployee(employee);
        return "Success";
    }

    @PutMapping(consumes = MediaType.APPLICATION_JSON_VALUE)
    public Employee updateEmployee(@RequestBody Employee employee) throws Exception {
        return this.employeeService.updateEmployee(employee);
    }

    @DeleteMapping(path = "{id}")
    public String deleteEmployee(@PathVariable int id) {
        this.employeeService.deleteEmployee(id);
        return "Success";
    }
}

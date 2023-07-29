package com.codegpt.training.service;

import com.codegpt.training.vo.Employee;

import java.util.List;

public interface IEmployeeService {

    List<Employee> getAllEmployee();

    void saveEmployee(Employee employee);

    void deleteEmployee(int id);

    Employee updateEmployee(Employee employee) throws Exception;

    Employee getEmployeeById(int id);
}

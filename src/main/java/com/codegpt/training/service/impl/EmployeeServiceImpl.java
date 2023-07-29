package com.codegpt.training.service.impl;

import com.codegpt.training.service.IEmployeeService;
import com.codegpt.training.vo.Employee;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class EmployeeServiceImpl implements IEmployeeService {

    List<Employee> employeeList = new ArrayList<>();

    @Override
    public List<Employee> getAllEmployee() {
        return employeeList;
    }

    @Override
    public void saveEmployee(Employee employee) {
        employeeList.add(employee);
    }

    @Override
    public void deleteEmployee(int id) {
        employeeList = employeeList.stream()
                .filter(employee -> employee.getId() != id)
                .collect(Collectors.toList());
    }

    @Override
    public Employee updateEmployee(Employee updatedEmployee) throws Exception {
//        if (null != updatedEmployee) {
//            employeeList.forEach(employeeObj -> {
//                if (employeeObj.getId() == updatedEmployee.getId()) {
//                    employeeObj.setName(updatedEmployee.getName());
//                    employeeObj.setCompanyName(updatedEmployee.getCompanyName());
//                }
//            });
//            return updatedEmployee;
//        }

        if (null != updatedEmployee) {
            for (Employee employeeObj: employeeList) {
                if (employeeObj.getId() == updatedEmployee.getId()) {
                    employeeObj.setName(updatedEmployee.getName());
                    employeeObj.setCompanyName(updatedEmployee.getCompanyName());
                    return updatedEmployee;
                }
            }
        }
        throw new Exception("not able to perform update operation;");
    }

    @Override
    public Employee getEmployeeById(int id) {
        for (Employee employee : employeeList) {
            if (employee.getId() == id) {
                return employee;
            }
        };
        return null;
    }
}

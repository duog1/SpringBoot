package com.example.lablesson3.service;


import com.example.lablesson3.entity.Employee;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class EmployeeService {
    private List<Employee> employees = new ArrayList<>();

    public EmployeeService() {
        employees.add(new Employee(1L, "Nguyễn Văn A", "Nam", 30, 1000));
        employees.add(new Employee(2L, "Trần Thị B", "Nữ", 28, 1200));
    }

    public List<Employee> getAllEmployees() {
        return employees;
    }

    public Employee getEmployeeById(Long id) {
        return employees.stream().filter(emp -> emp.getId().equals(id)).findFirst().orElse(null);
    }

    public Employee addEmployee(Employee employee) {
        employees.add(employee);
        return employee;
    }

    public boolean deleteEmployee(Long id) {
        return employees.removeIf(emp -> emp.getId().equals(id));
    }
}

package com.uv.learn_docker.service;

import com.uv.learn_docker.entity.Employee;
import com.uv.learn_docker.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeService {

    @Autowired
    private EmployeeRepository employeeRepository;

    public Employee addEmployee(Employee employee) {
        return employeeRepository.save(employee);
    }

    public List<Employee> getAllEmployees() {
        return employeeRepository.findAll();
    }

    public Employee getEmployeeById(Long id) {
        return employeeRepository.findById(id).orElse(null);
    }

    public Employee updateEmployee(Long id, Employee employee) {
        Employee existingEmployee = employeeRepository.findById(id).orElse(null);
        if (existingEmployee != null) {
            existingEmployee.setName(employee.getName());
            existingEmployee.setSalary(employee.getSalary());
            return employeeRepository.save(existingEmployee);
        }
        return null;
    }

    public String deleteEmployee(Long id) {
        employeeRepository.deleteById(id);
        return "Employee with id " + id + " deleted successfully";
    }
}

package com.empmgmt.service;

import java.util.List;

import com.empmgmt.model.Employee;

public interface EmployeeService {

     public List<Employee> getAllEmployees();

     public Employee createEmployee(Employee employee);

     public Employee getEmployee(Long id);

     public Employee updateEmployee(Long id, Employee employee);

     public void deleteEmployee(Long id);
}

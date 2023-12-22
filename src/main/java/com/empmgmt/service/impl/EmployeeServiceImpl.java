package com.empmgmt.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.empmgmt.exception.ResourceNotFoundException;
import com.empmgmt.model.Employee;
import com.empmgmt.repo.EmployeeRepo;
import com.empmgmt.service.EmployeeService;

@Service
public class EmployeeServiceImpl implements EmployeeService {

    @Autowired
    private EmployeeRepo employeeRepo;

    @Override
    public List<Employee> getAllEmployees() {

        return this.employeeRepo.findAll();
    }

    @Override
    public Employee createEmployee(Employee employee) {
        return this.employeeRepo.save(employee);
    }

    @Override
    public Employee getEmployee(Long id) throws ResourceNotFoundException {

        Employee employee = this.employeeRepo.findById(id)
        .orElseThrow(() -> new ResourceNotFoundException("Employee not exist!"));       
        
        return employee;
    }

    @Override
    public Employee updateEmployee(Long id, Employee employee) throws ResourceNotFoundException {

         Employee emp = this.employeeRepo.findById(id)
        .orElseThrow(() -> new ResourceNotFoundException("Employee not exist!"));   
        
        emp.setFirstName(employee.getFirstName());
        emp.setLastName(employee.getLastName());
        emp.setEmail(employee.getEmail());
        emp.setDob(employee.getDob());
        emp.setCompany(employee.getCompany());
        emp.setEducation(employee.getEducation());
        emp.setExperience(employee.getExperience());
        emp.setGender(employee.getGender());
        emp.setPkg(employee.getPkg());

        Employee updatedEmp = this.employeeRepo.save(emp);
        
        return updatedEmp;
    }

    @Override
    public void deleteEmployee(Long id) {
        this.employeeRepo.deleteById(id);
    }

}

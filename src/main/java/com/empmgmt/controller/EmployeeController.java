package com.empmgmt.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.empmgmt.model.Employee;
import com.empmgmt.service.EmployeeService;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
@RequestMapping("/api/v1")
public class EmployeeController {

    @Autowired
    private EmployeeService employeeService;


    @GetMapping("/employees")
    public List<Employee> getAllEmployees(){
          return this.employeeService.getAllEmployees();

    }

    @PostMapping("/employees")
    public Employee addEmployee(@RequestBody Employee employee){
          return this.employeeService.createEmployee(employee);

    }
    @GetMapping("/employees/{id}")
    public ResponseEntity< Employee> getEmployeeById(@PathVariable Long id){

        Employee employee = this.employeeService.getEmployee(id);

        return ResponseEntity.ok(employee);
        
    }

    @DeleteMapping("/employees/{id}")
    public void deleteEmployee(@PathVariable Long id){

        this.employeeService.deleteEmployee(id);

    }

    @PutMapping("/employees/{id}")
    public ResponseEntity< Employee> updateEmployee(@PathVariable Long id, @RequestBody Employee employee ){

        Employee emp = this.employeeService.updateEmployee(id, employee);

        return ResponseEntity.ok(emp);
        

    }
}

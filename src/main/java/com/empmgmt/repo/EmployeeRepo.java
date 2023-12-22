package com.empmgmt.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.empmgmt.model.Employee;

@Repository
public interface EmployeeRepo extends JpaRepository<Employee, Long> {

}

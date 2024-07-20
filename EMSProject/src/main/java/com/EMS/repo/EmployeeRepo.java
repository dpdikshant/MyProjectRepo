package com.EMS.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.EMS.model.Employee;

public interface EmployeeRepo extends JpaRepository<Employee, Integer> {

}

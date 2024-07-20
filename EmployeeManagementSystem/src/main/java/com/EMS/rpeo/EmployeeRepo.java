package com.EMS.rpeo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.EMS.enitity.Employee;

public interface EmployeeRepo extends JpaRepository<Employee, Integer>{

}

package com.EMS.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.EMS.model.Employee;
import com.EMS.repo.EmployeeRepo;
import com.EMS.service.EmployeeService;
@Service
public class EmployeeServiceImplementation implements EmployeeService{

	@Autowired
	private EmployeeRepo eRepo;
	
	
	@Override
	public Employee addEmployee(Employee employee) {
		
		Employee emp =eRepo.save(employee);
		return emp;
	}

	@Override
	public String removeEmployee(int id) {
		 eRepo.deleteById(id);
		return "Data Deleted Successfully";
	}

	@Override
	public Optional<Employee> findEmployeeById(int id) {

		Optional<Employee> emp = eRepo.findById(id);
		
		if(emp.isPresent()) {
			return emp;
		}else {
		return null;
		}
	}

	@Override
	public List<Employee> getAllEmployee() {
		List<Employee> listEmp = eRepo.findAll();
		
		return listEmp;
	}

	@Override
	public String updateEmployee(int id) {
		
		Optional<Employee> emp = eRepo.findById(id);
		
		if(emp.isPresent()) {
			Employee emps = new Employee();
			eRepo.save(emps);
			return "Data Updated successfully";
		}else {
		return "Employee not found";
		}
	}

}

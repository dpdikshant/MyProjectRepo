package com.EMS.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.EMS.enitity.Employee;
import com.EMS.rpeo.EmployeeRepo;

@Service
public class EmployeeService {
	@Autowired
	private EmployeeRepo eRepo;

	public Employee getEmployee(int id) {

		Optional<Employee> emp = eRepo.findById(id);
		Employee e = emp.get();
		return e;

	}

	public Employee addEmployee(Employee emp) {
		return eRepo.save(emp);
	}

	public void deleteEmployee(int id) {
		eRepo.deleteById(id);
	}

	public List<Employee> getAllEmp() {
		List<Employee> eList = eRepo.findAll();
		return eList;
	}

	public void deleteAllEmp() {
		eRepo.deleteAll();
	}

	public void updateEmployee(Employee emp, int id) {

		if (id == emp.getId()) {
			eRepo.save(emp);
		}

	}

}

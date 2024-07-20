package com.EMS.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.EMS.enitity.Department;
import com.EMS.enitity.Employee;
import com.EMS.rpeo.DepartmentRepo;

@Service
public class DepartmentService {

	@Autowired
	private DepartmentRepo dRepo;

	public Department getDepartment(int id) {

		Optional<Department> dep = dRepo.findById(id);
		Department d = dep.get();
		return d;

	}

	public Department addDepartment(Department dep) {
		return dRepo.save(dep);
	}

	public void deleteDepartmentById(int id) {
		dRepo.deleteById(id);
	}

	public List<Department> getAlldep() {
		List<Department> dList = dRepo.findAll();
		return dList;
	}

	public void deleteAlldep() {
		dRepo.deleteAll();
	}

	public void updateDepartment(Department dep, int id) {

		if (id == dep.getDEPid()) {
			dRepo.save(dep);
		}

	}

}

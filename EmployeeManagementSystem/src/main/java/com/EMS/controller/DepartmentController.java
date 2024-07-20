package com.EMS.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.EMS.enitity.Department;
import com.EMS.enitity.Employee;
import com.EMS.service.DepartmentService;

@RestController
public class DepartmentController {

	@Autowired
	private DepartmentService dService;

	@GetMapping("/Department")
	public List<Department> getAllEmp() {
		return dService.getAlldep();

	}

	@GetMapping("/Department/{id}")
	public Department getDepartment(@PathVariable int id) {
		return dService.getDepartment(id);

	}

	@PostMapping("/Department")
	public Department addDepartment(@RequestBody Department e) {
		return dService.addDepartment(e);

	}

	@DeleteMapping("Department/{id}")
	public void deletedep(@PathVariable int id, @RequestBody Department s) {
		dService.deleteDepartmentById(id);

	}

//	@DeleteMapping("/Department")
//	public void deleteAll() {
//		dService.deleteAlldep();
//	}

	@PutMapping("/Department/{id}")
	public void updateEmployee(@RequestBody Department d, @PathVariable int id) {

		dService.updateDepartment(d, id);

	}

}

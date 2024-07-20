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

import com.EMS.enitity.Employee;
import com.EMS.service.EmployeeService;

//@RestController
public class EmployeeController {
	@Autowired
	private EmployeeService eService;

	@GetMapping("/employee")
	public List<Employee> getAllEmp() {
		return eService.getAllEmp();

	}

	@GetMapping("/employee/{id}")
	public Employee getEmployee(@PathVariable int id) {
		return eService.getEmployee(id);

	}

	@PostMapping("/employee")
	public Employee addEmployee(@RequestBody Employee e) {
		return eService.addEmployee(e);

	}

	@DeleteMapping("employee/{id}")
	public void deleteEmp(@PathVariable int id, @RequestBody Employee s) {
		eService.deleteEmployee(id);

	}

//	@DeleteMapping("/employee")
//	public void deleteAll() {
//		eService.deleteAllEmp();
//	}

	@PutMapping("/employee/{id}")
	public void updateEmployee(@RequestBody Employee e, @PathVariable int id) {

		eService.updateEmployee(e, id);

	}

}

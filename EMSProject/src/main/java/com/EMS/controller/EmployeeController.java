package com.EMS.controller;

import java.lang.StackWalker.Option;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.service.annotation.GetExchange;

import com.EMS.impl.EmployeeServiceImplementation;
import com.EMS.model.Employee;
import com.EMS.repo.EmployeeRepo;

@RestController

public class EmployeeController {
	
	@Autowired
	private EmployeeServiceImplementation esImp;
	
	
	
	
	@RequestMapping("/home")
	public String homePage() {
		return "welcome to EMS";
	}
	
	@PostMapping("/addEmp")
	public ResponseEntity<Employee> addEmployee(@RequestBody Employee employee)
	{
		Employee emp =esImp.addEmployee(employee);
		return new ResponseEntity<Employee>(emp, HttpStatus.CREATED) ;
	}
	
	@DeleteMapping("/delID{id}")
	public ResponseEntity<String> removeEmployee(@PathVariable int id)
	{
		esImp.removeEmployee(id);
		return new ResponseEntity<String>("Data Removed Successfully", HttpStatus.ACCEPTED);
	}
	
	@GetMapping("/findEmp{id}")
	public ResponseEntity<Optional<Employee>> fineById(@PathVariable int id)
	{
		Optional<Employee> emps = esImp.findEmployeeById(id);
		return new ResponseEntity<Optional<Employee>>(emps, HttpStatus.ACCEPTED);
	}
	
	@GetMapping("/getAllEmp")
	public ResponseEntity<List<Employee>> listOfEmployee()
	{
		List<Employee> listEmp = esImp.getAllEmployee();
		return new ResponseEntity<List<Employee>>(listEmp, HttpStatus.ACCEPTED);
	}
	
	@PostMapping("/updateEmp{id}")
	public ResponseEntity<String> updateEmployee(@PathVariable int id)
	{
		 esImp.updateEmployee(id);
		return new ResponseEntity<String>("Data Updated", HttpStatus.ACCEPTED);
	}
	
	
	
	
	
	
	
	
	
	
	

}

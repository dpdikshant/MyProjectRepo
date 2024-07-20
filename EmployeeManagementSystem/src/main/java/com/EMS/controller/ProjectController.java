package com.EMS.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.EMS.enitity.Employee;
import com.EMS.enitity.Project;
import com.EMS.service.ProjectService;

@RestController
public class ProjectController {
	
	@Autowired
	private ProjectService pService;

	@GetMapping("/project")
	public List<Project> getAllEmp(){
		return pService.getAllpro();
		
	}
	
	@GetMapping("/project/{id}")
	public Project getProject(@PathVariable int id) {
		return pService.getProject(id);
		
	}
	
	@PostMapping("/project")
	public Project addProject(@RequestBody Project e) {
		return pService.addProject(e);
		
	}
	
	@DeleteMapping("project/{id}")
	public void deleteEmp(@PathVariable int id, @RequestBody Project s) {
		pService.deleteProject(id);
		
	}
	
//	@DeleteMapping("/project")
//	public void deleteAll() {
//		pService.deleteAllpro();
//	}
	
	@PutMapping("/project/{id}")
	public void updateProject(@RequestBody Project p, @PathVariable int id) {

		pService.updateProject(p, id);
	
	}	

}

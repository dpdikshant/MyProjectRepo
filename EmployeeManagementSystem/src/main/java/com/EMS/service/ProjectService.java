package com.EMS.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.EMS.enitity.Employee;
import com.EMS.enitity.Project;
import com.EMS.rpeo.ProjectRepo;

@Service
public class ProjectService {

	@Autowired
	private ProjectRepo pRepo;

	public Project getProject(int id) {

		Optional<Project> pro = pRepo.findById(id);
		Project p = pro.get();
		return p;

	}

	public Project addProject(Project pro) {
		return pRepo.save(pro);
	}

	public void deleteProject(int id) {
		pRepo.deleteById(id);
	}

	public List<Project> getAllpro() {
		List<Project> eList = pRepo.findAll();
		return eList;
	}

	public void deleteAllpro() {
		pRepo.deleteAll();
	}

	public void updateProject(Project p, int id) {

		if (id == p.getP_no()) {
			pRepo.save(p);
		}

	}

}

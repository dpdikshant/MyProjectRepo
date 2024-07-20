package com.EMS.Runner;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Component;

import com.EMS.enitity.Department;
import com.EMS.rpeo.DepartmentRepo;

@Component
public class Runner implements CommandLineRunner {
	
	@Autowired
	private DepartmentRepo dRepo;

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		                   //page number  //page size
		
		Pageable page = PageRequest.of(1,3);
		
		Page<Department> pref = dRepo.findAll(page);
		
		List<Department> list= pref.getContent();
		
		for(Department L:list) {
			System.out.println(L);
		}
	}
	
	

}

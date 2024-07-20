package com.EMS.enitity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Entity
public class Department {

	@Id
	private int DEPid;
	private String department;

	@ManyToOne
	@JoinColumn(name = "p_no")
	private Project project;

	public Department() {
		super();
	}

	public Department(int dEPid, String department, Project project) {
		super();
		DEPid = dEPid;
		this.department = department;
		this.project = project;

	}

	public Project getProject() {
		return project;
	}

	public void setProject(Project project) {
		this.project = project;
	}

	public int getDEPid() {
		return DEPid;
	}

	public void setDEPid(int dEPid) {
		DEPid = dEPid;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	@Override
	public String toString() {
		return "Department [DEPid=" + DEPid + ", department=" + department + ", project=" + project + "]";
	}

	
}

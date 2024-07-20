package com.EMS.enitity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Project {
	@Id
	private int P_no;
	private String name;
	private String location;

	@Override
	public String toString() {
		return "Project [P_no=" + P_no + ", name=" + name + ", location=" + location + "]";
	}

	public Project() {
		super();
	}

	public Project(int p_no, String name, String location) {
		super();
		P_no = p_no;
		this.name = name;
		this.location = location;
	}

	public int getP_no() {
		return P_no;
	}

	public void setP_no(int p_no) {
		P_no = p_no;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

}

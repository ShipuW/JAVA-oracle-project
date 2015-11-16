package com.oracle.model;

import java.util.ArrayList;
import java.util.List;

public class Team {
	private String id;
	private String teamName;
	//hibernate使用list来模拟bag
	private List students = new ArrayList();

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getTeamName() {
		return teamName;
	}

	public void setTeamName(String teamName) {
		this.teamName = teamName;
	}

	public List getStudents() {
		return students;
	}

	public void setStudents(List students) {
		this.students = students;
	}
}

package com.oracle.model;

public class Student {
	private String id;
	private String name;
	// 关联到身份证号
	private IdCard idCarid;
	//关联team多对一的关系
	private Team team;

	public Team getTeam() {
		return team;
	}

	public void setTeam(Team team) {
		this.team = team;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public IdCard getIdCarid() {
		return idCarid;
	}

	public void setIdCarid(IdCard idCarid) {
		this.idCarid = idCarid;
	}
}

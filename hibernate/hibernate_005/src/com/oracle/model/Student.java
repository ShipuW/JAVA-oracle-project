package com.oracle.model;

public class Student {
	private String id;
	private String name;
	// ���������֤��
	private IdCard idCarid;
	//����team���һ�Ĺ�ϵ
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

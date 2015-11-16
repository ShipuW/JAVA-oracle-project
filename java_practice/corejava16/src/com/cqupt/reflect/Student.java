package com.cqupt.reflect;

import java.io.Serializable;

public class Student implements Serializable,Comparable{
	private int sid;
	private String sname;
	public int sex;
	protected int age=999;
	private int my=10000;
	
	public int getMoney() {
		return my;
	}

	public Student() {
		super();
		System.out.println("**************");
		// TODO Auto-generated constructor stub
	}

	public Student(int sid, String sname) {
		super();
		this.sid = sid;
		this.sname = sname;
	}

	public int getSid() {
		return sid;
	}

	public void setSid(int sid) {
		this.sid = sid;
	}

	public String getSname() {
		return sname;
	}

	public void setSname(String sname) {
		this.sname = sname;
	}




	
/*	public String toString() {
		return "Student [sid=" + sid + ", sname=" + sname + "]";
	}*/

	@Override
	public int hashCode() {
		/*final int prime = 31;
		int result = 1;
		result = prime * result + sid;
		result = prime * result + ((sname == null) ? 0 : sname.hashCode());
		return result;*/
		return 1;
	}

	@Override
	public int compareTo(Object o) {
		// TODO Auto-generated method stub
		return 0;
	}


	/*public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student other = (Student) obj;
		if (sid != other.sid)
			return false;
		if (sname == null) {
			if (other.sname != null)
				return false;
		} else if (!sname.equals(other.sname))
			return false;
		return true;
	}*/

	private void add()
	{
		
	}
	private void print()
	{
		
	}



}

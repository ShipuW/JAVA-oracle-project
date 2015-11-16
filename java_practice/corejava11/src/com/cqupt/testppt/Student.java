package com.cqupt.testppt;

public class Student implements Comparable {
	private int age;
	private String name;
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Student(int age,String name){
		super();
		this.age=age;
		this.name=name;
	}
	public Student(){
		super();
	}
	public String toString(){
		return "ĞÕÃû:"+this.name+"  ÄêÁä:"+this.age;
	}
	public int compareTo(Object o){
		Student s=(Student)o;
		return this.age-s.age;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + age;
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student other = (Student) obj;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (age != other.age)
			return false;
		return true;
	}
	
}

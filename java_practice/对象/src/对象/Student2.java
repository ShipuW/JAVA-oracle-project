package ����;

public class Student2 {
	String name;
	String number;
	String clas;
	String sex;
	int age;
	String address;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getNumber() {
		return number;
	}
	public void setNumber(String number) {
		this.number = number;
	}
	public String getClas() {
		return clas;
	}
	public void setClas(String clas) {
		this.clas = clas;
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String sayHello(){
		return "����:"+this.name+"  ѧ��:"+this.number+"  �༶:"+this.clas+"  �Ա�:"+this.sex+"  ����:"+this.age+"  ��ַ:"+this.address;
	}
	public String toString(){
		return "����:"+this.name+"  ѧ��:"+this.number+"  �༶:"+this.clas+"  �Ա�:"+this.sex+"  ����:"+this.age+"  ��ַ:"+this.address;
	}
	
}

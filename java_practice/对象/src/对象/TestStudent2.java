package 对象;

public class TestStudent2 {
	public static void main(String[] args){
		Student2 stu1 = new Student2();
		Student2 stu2 = new Student2();
		stu1.setName("張三");
		stu1.setNumber("2012211796");
		stu1.setClas("0401207");
		stu1.setSex("male");
		stu1.setAge(18);
		stu1.setAddress("cqupt");
		
		stu2.setName("李四");
		stu2.setNumber("2012211885");
		stu2.setClas("0401208");
		stu2.setSex("female");
		stu2.setAge(20);
		stu2.setAddress("cqupt");
		
		Integer stu1age = new Integer(stu1.getAge());
		Integer stu2age = new Integer(stu2.getAge());
			if(stu1age>stu2age)
				System.out.println(stu1.sayHello());
			else
				System.out.println(stu2);
	}		
}

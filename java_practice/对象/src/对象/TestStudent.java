package ����;

public class TestStudent {
	public static void main(String[] args) {
		Student stu1 = new Student(18, "����");
		Student stu2 = new Student(18, "����");
		System.out.println(stu1 == stu2);
		System.out.println(stu1.equals(stu2));
		System.out.println((stu1.name).equals(stu2.name));
		Integer I1 = new Integer(stu1.age);
		Integer I2 = new Integer(stu2.age);
		System.out.println(I1.equals(I2));
		String s1 = new String("����");
		String s2 = new String("����");
		System.out.println(s1 == s2);
		System.out.println(s1.equals(s2));
	}

}

package ques271.cqupt;

public class ClassB {
	public ClassC classC;
	public String getValue(){
		return classC.getValue();
	}
	
	public static void main(String[] args) {
		StringBuilder s = new StringBuilder("123456789");
		s.delete(0, 3);
		System.out.println(s);
		s.delete(1, 3);
		System.out.println(s);
		s.delete(2, 5);
		System.out.println(s);
		s.insert(1, "24");
		System.out.println(s);
		
	}
}

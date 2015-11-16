package ques205.cqupt;

public class TestDeclare implements DeclaerStuff {
	public static void main(String[] args) {
		int x = 5;
		new TestDeclare().doStuff(++x);
	}
	public void doStuff(int s){
		System.out.println(s);
		s +=EASY + ++s;
		System.out.println(s);
	}
}

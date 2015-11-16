package ques27.cqupt;

public class Test {
	private Integer i =1;
	int a = i;
	public int addOne(){
		return ++i;
	}
	
	public static void main(String[] args) {
		int x = 0;
		int y = 1;
		String z="";
		z=z+0+1;
		System.out.println(z);
		//System.out.println(new Test().addOne());
		//System.out.println(new Test().a);
	}
}

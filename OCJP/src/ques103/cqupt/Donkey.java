package ques103.cqupt;

public class Donkey {
	public static void main(String[] args) {
		boolean assertsOn = false;
		System.out.println("aa");
		assert(assertsOn):assertsOn=true;//断言没有开，则这句话不会执行
		if(assertsOn){
			System.out.println("assert is on");
			
		}
		System.out.println("zjz");
	}
}

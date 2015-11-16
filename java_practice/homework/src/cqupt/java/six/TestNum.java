package cqupt.java.six;

import java.util.Scanner;

public class TestNum {
	public static void main(String[] args) {
		System.out.print("请输入一个整数：");
		while(true){
			Scanner sc = new Scanner(System.in);
			String a = sc.next();
			try{
				test(a);
				break;
			}catch(MyException e ){
				System.out.println(e);
				System.out.println("请重新输入：");
			}
		}
		
	}
	//判断 a 是否为数字
	public static void test(String a) throws MyException{
		//使用正则表达式判断
		/*+表示1个或多个（[0-9]+）如“5”或“222”,*表示0个或多个（[0-9]*）如“”或“5”或“22”，
		 ？表示0个或1个（[0-9]?）如“”或“5” 
		*/
		if(a.matches("[0-9]+")){
			System.out.println("该整数为："+a);
		}else{
			throw new MyException(a);
		}
	} 
}

package cqupt.java.six;

import java.util.Scanner;

public class TestNum {
	public static void main(String[] args) {
		System.out.print("������һ��������");
		while(true){
			Scanner sc = new Scanner(System.in);
			String a = sc.next();
			try{
				test(a);
				break;
			}catch(MyException e ){
				System.out.println(e);
				System.out.println("���������룺");
			}
		}
		
	}
	//�ж� a �Ƿ�Ϊ����
	public static void test(String a) throws MyException{
		//ʹ��������ʽ�ж�
		/*+��ʾ1��������[0-9]+���硰5����222��,*��ʾ0��������[0-9]*���硰����5����22����
		 ����ʾ0����1����[0-9]?���硰����5�� 
		*/
		if(a.matches("[0-9]+")){
			System.out.println("������Ϊ��"+a);
		}else{
			throw new MyException(a);
		}
	} 
}

package com.cqupt.list;

import java.util.ArrayList;
import java.util.List;

public class TestStulist {
	public static void main(String[] args) {
		int a=Menuehelp.menu();
		
		switch(a) {
		case 1:
			
			break;

		default:System.out.println("�����������������");
		
		}
		List li=new ArrayList();
		li.add(s1);
		li.add(s2);
		li.add(s3);
		li.add(s4);
		li.add(s5);
		//������������Ķ���
		UseIterator.PrintIte(li);
		//�������ѧ������
	    System.out.println(StuListTool.findByName("Lisi1", li));
		//����ɾ��һ��ѧ���ķ���
		
	}

}

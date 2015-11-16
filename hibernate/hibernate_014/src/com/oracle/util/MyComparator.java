package com.oracle.util;

import java.util.Comparator;

import com.oracle.model.Student;

public class MyComparator implements Comparator<Student> {

	@Override
	public int compare(Student stu1, Student stu2) {
		// �ȸ���cardid�����������һ������ʹ��name����
		if (stu1 == stu2) {
			return 0;
		}
		// �����ֶδ�����
		int result = stu1.getCardId().compareTo(stu2.getCardId());
		if (result != 0) {
			return -result;
		}

		return -stu1.getName().compareTo(stu2.getName());
	}

}

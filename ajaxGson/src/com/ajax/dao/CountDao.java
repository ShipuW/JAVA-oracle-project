package com.ajax.dao;

import com.ajax.entity.Count;

/**
 * ���ں����ݿ�򽻵����������ݿ������
 * @author ��˧
 *
 */
public class CountDao {
	/**
	 * ��������������ӵĲ���
	 * 
	 */
	public int add(Count count){
		/*�˴�ʡ�Խ������ݿ�����ӣ����ݿ�����ķ���*/
		return count.getNum1()+count.getNum2();
	}

}

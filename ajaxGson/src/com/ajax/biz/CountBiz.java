package com.ajax.biz;

import com.ajax.dao.CountDao;
import com.ajax.entity.Count;

/**
 * ҵ���߼�
 * 
 * @author ��˧
 *
 */
public class CountBiz {
	/**
	 * ҵ���߼���ķ��������ڵ�������������ӵ�
	 * 
	 */
	public int addBiz(Count count){
		//����dao��
		return new CountDao().add(count);
	}
}

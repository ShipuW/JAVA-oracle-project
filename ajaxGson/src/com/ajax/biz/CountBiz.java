package com.ajax.biz;

import com.ajax.dao.CountDao;
import com.ajax.entity.Count;

/**
 * 业务逻辑
 * 
 * @author 朱帅
 *
 */
public class CountBiz {
	/**
	 * 业务逻辑层的方法，用于调用两个数字相加的
	 * 
	 */
	public int addBiz(Count count){
		//调用dao层
		return new CountDao().add(count);
	}
}

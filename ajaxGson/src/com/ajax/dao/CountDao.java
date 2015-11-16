package com.ajax.dao;

import com.ajax.entity.Count;

/**
 * 用于和数据库打交道，进行数据库的连接
 * @author 朱帅
 *
 */
public class CountDao {
	/**
	 * 进行两个数字相加的操作
	 * 
	 */
	public int add(Count count){
		/*此处省略进行数据库的连接，数据库操作的方法*/
		return count.getNum1()+count.getNum2();
	}

}

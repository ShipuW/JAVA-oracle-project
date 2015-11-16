package com.oracle.model;

import java.io.Serializable;

/**
 * 1.如果一个类是联合主键他要实现Serializable接口
 * 2.对应的实现类要实现hashCode和equals原因：在于Hiberante要根据数据库的联合主键来判断某两行记录是否是一样的
 * ，如果一样那么认为是同一个对象，
 * 如果不一样，那么就认为是不同的对象。这反映到程序领域中就是根据hashCode与equals方法来判断某两个对象是否能够放到诸如set这样的集合中。
 * 
 * @author Administrator
 * 
 */
public class Student implements Serializable {
	// 第一个主键列
	private String cardId;
	public String getCardId() {
		return cardId;
	}

	public void setCardId(String cardId) {
		this.cardId = cardId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	// 第二个主键列
	private String name;
	private int age;

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((cardId == null) ? 0 : cardId.hashCode());
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student other = (Student) obj;
		if (cardId == null) {
			if (other.cardId != null)
				return false;
		} else if (!cardId.equals(other.cardId))
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}

}

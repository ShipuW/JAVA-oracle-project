package com.oracle.model;

import java.io.Serializable;

/**
 * 1.���һ����������������Ҫʵ��Serializable�ӿ�
 * 2.��Ӧ��ʵ����Ҫʵ��hashCode��equalsԭ������HiberanteҪ�������ݿ�������������ж�ĳ���м�¼�Ƿ���һ����
 * �����һ����ô��Ϊ��ͬһ������
 * �����һ������ô����Ϊ�ǲ�ͬ�Ķ����ⷴӳ�����������о��Ǹ���hashCode��equals�������ж�ĳ���������Ƿ��ܹ��ŵ�����set�����ļ����С�
 * 
 * @author Administrator
 * 
 */
public class Student implements Serializable {
	// ��һ��������
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

	// �ڶ���������
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

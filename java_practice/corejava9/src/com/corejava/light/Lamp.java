package com.corejava.light;
/**
 * �������� 
 * �о����� ��Զֻ�ܿ��ƺ��   ͻȻ������̵� ֻ�ܸĴ���
 * @author Administrator
 *
 */
public class Lamp {
	private RedBuble redBuble;

	public RedBuble getRedBuble() {
		return redBuble;
	}

	public void setRedBuble(RedBuble redBuble) {
		this.redBuble = redBuble;
	}
	public void on(){
		redBuble.light();
	}
}

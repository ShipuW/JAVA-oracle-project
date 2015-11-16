package com.corejava.light;
/**
 * 控制中心 
 * 有局限性 永远只能控制红灯   突然想控制绿灯 只能改代码
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

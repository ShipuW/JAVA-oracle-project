package com.corejava.cankao;

public class Factoryobj {
	public static FileSave getobj(int a){
	switch (a) {
	case 1:return new SaveToTxt();
	case 2:return new SaveTodoc();
	default:return null;
	}	
	}
	
}

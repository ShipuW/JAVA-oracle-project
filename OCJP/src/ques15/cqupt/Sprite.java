package ques15.cqupt;

import ques10.cqupt.Foo;

public class Sprite {
	public int fubar(Foo foo){
		return foo.bar();
	}
	
	public void testFoo(){
		System.out.println(	fubar(new Foo(){
			public int bar(){
				return 1;
			}
		}));
	
	}
	public static void main(String[] args) {
		new Sprite().testFoo();
	}
}


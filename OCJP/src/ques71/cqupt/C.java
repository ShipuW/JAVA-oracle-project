package ques71.cqupt;

import java.util.List;
import java.util.ArrayList;

public class C extends B{
	public void x(){
		System.out.println("C");
	}
	
	public static void main(String[] args) {
		List<A> list = new ArrayList<A>();
		list.add(new B());
		list.add(new C());
		for (A a : list) {
			a.x();
		}
	}
}


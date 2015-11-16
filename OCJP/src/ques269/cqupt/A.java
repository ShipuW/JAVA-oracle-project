package ques269.cqupt;

import java.util.Collection;
import java.util.LinkedList;

public class A {
	public static Collection get(){
		Collection sorted = new LinkedList<>();
		sorted.add("B");
		sorted.add("C");
		sorted.add("A");
		return sorted;
	}
	public static void main(String[] args) {
		for (Object obj : get()) {
			System.out.println(obj);
		}
	}
}

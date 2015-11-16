package com.cqupt.test;

public class Testex {

	/**
	 * @param args
	 * @throws MyException
	 */
	public static void main(String[] args) {
		try {
			test();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println(e.getMessage());
		}

	}

	public static void test() throws MyException {
		throw new MyException("1<2??");
	}
}
 
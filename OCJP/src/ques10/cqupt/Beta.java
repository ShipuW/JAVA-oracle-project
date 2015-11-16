package ques10.cqupt;

public class Beta {
	public int fubar(Foo foo){
		return foo.bar();
	}
	class A implements Foo{
		public int bar(){			
			return 1;
		}
	}
	
	public void testFoo(){
	/*	class A implements Foo{
			public int bar(){
				return 2;
			}
		}*/
		
		System.out.println(fubar(new A()));
	}
	
	public static void main(String[] args) {
		new Beta().testFoo();
	}
}

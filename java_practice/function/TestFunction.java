/**
	º¯ÊýµÄÑÝÊ¾
	
*/
class TestFunction{
	public static void print(){
		for(int i=1;i<=4;i++){
			for(int j=1;j<=4;j++){
				System.out.print("* ");
			}
			System.out.println();
		}
	
	}
	public static void printab(int a,int b){
		if(true)
		{
			return;
		}
		for(int i=1;i<=a;i++){
			for(int j=1;j<=b;j++){
				System.out.print("* ");
			}
			System.out.println();
		}
	}
	public static int add(int a,int b){
		return a+b;
	}

	public static void main(String [] args){
		printab(5,5);
		System.out.println("---------------------------------");
		printab(9,9);
		int a = add(249,1); //
		System.out.println(a);
		
	}
	
	
}
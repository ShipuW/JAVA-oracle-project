class TestFunction2{
	//函数定义
	public static void print(){
		System.out.println("----print()--");
	
	}
	
	//函数定义
	public static int add(int a,int b){
		int s = a+b;
		return s;
	}
	
	//函数定义
	public static int djy(int m){	
		int count = m/8;
		return count;
	}
	
	public static void main(String[] args){
		System.out.println("------------start main-----------");
		//函数调用
		print();
		//函数调用
		int s = add(12,34);//实际参数
		System.out.println(s);
		//函数调用
		int count = djy(16);
		
		System.out.println("------------end main-----------");
		
	}
	

	
}
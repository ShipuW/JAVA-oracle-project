class TestFunction3{
	public static void main(String[] args){
		int b =10;
		auto(b);//函数调用 传递的是地址
		System.out.println("b="+b);//10
		
		int[] a = new int[2];
		a[0]=10;
		a[1]=11;
		System.out.println("a[0]"+a[0]);//10
		System.out.println("a[1]"+a[1]);//11
		System.out.println("------------");
		//传递的是地址
		funarr(a);
		System.out.println("a[0]"+a[0]);//250
		System.out.println("a[1]"+a[1]);//251
		//传递的是值
		funarr2(a[1]);
		System.out.println("a[1]"+a[1]);//??? 11  251

	}
	//参数 值类型  值传递
	public static void auto(int a){
		a++;
		System.out.println("a="+a);//11
	}
	//数组做参数 传递是地址  b数组和 实参数组 同享内存单元
	public static void funarr(int b[]){
		b[0]=250;
		b[1]=251;
	}
	//参数 值类型  值传递
	publict static void funarr2(int a)
	{
		a++;
	}
}
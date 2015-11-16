import java.util.*;
/**
	函数综合应用演示
*/
class Testjxc{
	public static void main(String[] args){
		
		int code = input("please input code：");
		int pass = input("Please input pass：");
		boolean flag = isLogin(code,pass);
		if(flag){
			while(true)
			{	
				//这是显示主菜单
				showMenu();
				//接受用户输入选项
				int option = input("Please input 1 -5:");
				switch(option){
					case 1:	add(12,23);	break;
					case 2:break;
					case 3:break;
					case 4:break;
					case 5:System.exit(0);
				}
			}
		}
	}
	/**
		求和
	*/
	public static void add(int a,int b){
		System.out.println("a+b="+(a+b));
		System.out.println("a+b="+(a+b));
		System.out.println("a+b="+(a+b));
		int op = input(" 输入1 继续 2 返回");
		if(op==1)
		{
			add(11,22);
		}else
		{
		
		}
	}
	/**
		登陆验证返回true or false;
	*/
	public static boolean  isLogin(int code,int pass){
		if(code ==123&&pass==456)
		{
			return true;
		}else
		{
			return false;
		}
	}
	/**
		封装了输入整数功能
	*/
	public static int input(String s)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println(s);
		int code = sc.nextInt();
		return code;
	}
	/**
		显示菜单
	*/
	public static void showMenu()
	{
		System.out.println("-------welcom------");
		System.out.println("-------1.add------");
		System.out.println("-------2.div------");
		System.out.println("-------3.del------");
		System.out.println("-------4.update---");
		System.out.println("-------5.exit------");
	}
}
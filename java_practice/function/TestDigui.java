/**
	µ›πÈ—› æ
*/
class TestDigui{
	public static void main(String[] args){
		/*int s =1;
		for(int i=1;i<=5;i++){
			
			s=s*i;//5*4*3*2*1;
		}
		System.out.println("s="+s);*/
		
		int s = dg(5);
		System.out.println("s="+s);
		
	}
	public static int js(int a){
		int s =1;
		for(int i=1;i<=a;i++){
			
			s=s*i;//5*4*3*2*1;
		}
		return s;
	}
	//µ›πÈ
	public static int dg(int a){//
		int s = 1;
		if(a==1) //µ›πÈ÷’÷πÃıº˛
		{
			return s;
		}else
		{
			s= a*dg(a-1);//Õ∆
		}
		return s;
	}
}
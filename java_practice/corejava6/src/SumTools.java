
public class SumTools {

	public int add(int a,int b){
		return a+b;
	}
	//个数不一致
	public int add(int a,int b,int c){
		return a+b+c;
	}
	//类型不一致
	public double add(double a,double b){
		return a+b;
	}
	//类型不一致
	public long add(long a,long b){
		return a+b;
	}
	
	//顺序不一致  也是构成重载  注意下面两个方法  用得比较少
	public long add(int a,long b){
		return a+b;
	}
	public long add(long a,int b){
		return a+b;
	}
	//类型不一致
	public String add(String a,String b){
		return a+b;
	}
	

}

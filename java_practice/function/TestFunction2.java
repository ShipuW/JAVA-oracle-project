class TestFunction2{
	//��������
	public static void print(){
		System.out.println("----print()--");
	
	}
	
	//��������
	public static int add(int a,int b){
		int s = a+b;
		return s;
	}
	
	//��������
	public static int djy(int m){	
		int count = m/8;
		return count;
	}
	
	public static void main(String[] args){
		System.out.println("------------start main-----------");
		//��������
		print();
		//��������
		int s = add(12,34);//ʵ�ʲ���
		System.out.println(s);
		//��������
		int count = djy(16);
		
		System.out.println("------------end main-----------");
		
	}
	

	
}
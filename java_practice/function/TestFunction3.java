class TestFunction3{
	public static void main(String[] args){
		int b =10;
		auto(b);//�������� ���ݵ��ǵ�ַ
		System.out.println("b="+b);//10
		
		int[] a = new int[2];
		a[0]=10;
		a[1]=11;
		System.out.println("a[0]"+a[0]);//10
		System.out.println("a[1]"+a[1]);//11
		System.out.println("------------");
		//���ݵ��ǵ�ַ
		funarr(a);
		System.out.println("a[0]"+a[0]);//250
		System.out.println("a[1]"+a[1]);//251
		//���ݵ���ֵ
		funarr2(a[1]);
		System.out.println("a[1]"+a[1]);//??? 11  251

	}
	//���� ֵ����  ֵ����
	public static void auto(int a){
		a++;
		System.out.println("a="+a);//11
	}
	//���������� �����ǵ�ַ  b����� ʵ������ ͬ���ڴ浥Ԫ
	public static void funarr(int b[]){
		b[0]=250;
		b[1]=251;
	}
	//���� ֵ����  ֵ����
	publict static void funarr2(int a)
	{
		a++;
	}
}
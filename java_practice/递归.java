class TestDigui
{
	public static void main(String[] args)
	{
		int s = dg(5);
		System.out.println("s="+s);
	}
	public static int js(int a)
	{
		int s = 1;
		for(int i=1;i<=a;i++)
		{
			s=s*i;
		}
		return s;
	}
	//ตÝน้
	public static int dg(int a)
	{
		int s = 1;
		if(a==1)
		{
			return s;
		}
		else
		{
			s=a*dg(a-1);
		}
		return s;
	}
}
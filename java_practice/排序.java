import java.util.*;
class input
{
	public static void main(String [] args)
	{
		Scanner sc=new Scanner(System.in);
		//����һ������
		int [] a = new int [5];
		int i,j;
		for(i=0;i<5;i++)
		{
			System.out.println("please input a number:");
			a[i]=sc.nextInt();
		}
		paixu(a);
		for(j=0;j<5;j++)
		{
			System.out.println(a[j]);
		}
	
	}
	//�������ɴ�С����
	public static void paixu(int []a)
	{
		int i,j;
		for(i=0;i<4;i++)
		{
			for(j=0;j<4;j++)
			{
				if(a[j]<a[j+1])
				{
					int tamp=a[j+1];
					a[j+1]=a[j];
					a[j]=tamp;
				}
			}	
		}
	}
}
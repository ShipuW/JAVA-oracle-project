class Test1{
	public static void main(String []args)
	{
		int[][] a=new int[3][4];
		for(int i=0;i<a.length;i++){
			for(int j=0;j<a[i].length;j++){
				a[i][j]=100+i*j;
			}
		}
		print2array(a);
		System.out.println("-------------qiu hanghe-------------");
		sum(a);
		System.out.println("-------------qiu liehe-------------");
		sum1(a);
	}
	public static void print2array(int[][]a)
	{
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a[i].length;j++){
				System.out.print(a[i][j]+" ");
			}
			System.out.println();
		}
	}
	public static void sum(int[][]a){
		for(int i=0;i<a.length;i++)
		{
			int s=0;
			for(int j=0;j<a[i].length;j++){
				System.out.print(a[i][j]+" ");
				s+=a[i][j];
			}
			System.out.print(" "+s);	
			System.out.println();
		}
	}
	public static void sum1(int[][]a)
	{
		int[] sum=new int[4];
		for(int i=0;i<a.length;i++){
			for(int j=0;j<a[i].length;j++)
			{
				System.out.print(a[i][j]+" ");
				sum[j]=sum[j]+a[i][j];
			}
			System.out.println();
		}
		System.out.println();
		for(int i=0;i<4;i++)
			System.out.print(sum[i]+" ");
	}
}
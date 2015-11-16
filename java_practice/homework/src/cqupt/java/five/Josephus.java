package cqupt.java.five;

import java.util.LinkedList;

public class Josephus {
	private int n;//一共几个人
	private int m;//数几个人
	private LinkedList<Integer> list = new LinkedList<Integer>();
	//一圈输完后，临时存放出列的人
	private LinkedList<Integer> temp = new LinkedList<Integer>();
	/*
	 * 构造约瑟夫环
	 */
	public Josephus(int n,int m){
		this.n = n;
		this.m = m;
		for (int i = 1; i <= this.n; i++) {
			this.list.add(i);
		}
	}
	
	/*
	 * 递归 执行主体
	 *@param   last为上一圈尾部未出列人的个数
	 * last初值为0
	 */
	public void start(int last){
		int size = list.size();//返回此列表元素数
		if(list.size() == 1){
			System.out.println(list.get(0)+" is winner！");
			return ;
		}
		for (int i = 1; i <= size; i++) {
			if((i+last)%m == 0){
				System.out.println(list.get(i-1)+" out");
				//将出局人存放置临时列表里
				temp.add(list.get(i-1));
			}
		}
		//删除临时列表的人
		for (Integer str : temp) {
			list.remove(str);
			}
		//清除temp表中所有元素
		temp.clear();
		//递归
		//下一圈 last2 =（size-(m-last)）%m
		start((size+last)%m);	
	}
}

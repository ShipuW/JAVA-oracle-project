package cqupt.java.five;

import java.util.LinkedList;

public class YuesefuQustion {
	public static void main(String[] args) {
		//用一个整形int 链表来存那个环 本来这个链表可以存任何类，但是我们这里只放入整形，也就是Integer(int 的包装类 因为int为基本数据类型，但我们需要要用对象，而Integer就是int 的对象 就把它看成int就行了)
		LinkedList<Integer> integers=new LinkedList<Integer>();
		//我们需要的两个数
		int n=8;
		int m=3;
		//依次放入12345678
		for(int i=1;i<=n;i++){
			integers.add(i);
		}
		//打印出来 此方法在后面自己写的
		printList(integers);
		//淘汰算法
		
		int j=0;//需要移除去的位置
		
		for(int i=1;i<n;i++){
			System.out.println();
			System.out.println("第"+i+"次淘汰");
			//j的变化跟m n 有关 j就是我们要移除去的位置
			j=(j+m-1)%(n-i+1);
			//移除 这个方法在LinkList里面本来就有的也就是Integers当中本来就有移除固定位置的对象
			integers.remove(j);
			printList(integers);
		}
		System.out.println();
		//移除完了以后就只剩一个了，所以打印链表的第一个
		System.out.println("胜利者为:"+integers.get(0));
	}
	//这是我们自己定义的打印的方法
	private static void printList(LinkedList<Integer> integers) {
		System.out.println("约瑟夫环为：");
		for (Integer integer : integers) {
			System.out.print(integer+"》");
		}
	}
}




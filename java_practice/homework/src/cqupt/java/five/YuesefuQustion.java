package cqupt.java.five;

import java.util.LinkedList;

public class YuesefuQustion {
	public static void main(String[] args) {
		//��һ������int ���������Ǹ��� �������������Դ��κ��࣬������������ֻ�������Σ�Ҳ����Integer(int �İ�װ�� ��ΪintΪ�����������ͣ���������ҪҪ�ö��󣬶�Integer����int �Ķ��� �Ͱ�������int������)
		LinkedList<Integer> integers=new LinkedList<Integer>();
		//������Ҫ��������
		int n=8;
		int m=3;
		//���η���12345678
		for(int i=1;i<=n;i++){
			integers.add(i);
		}
		//��ӡ���� �˷����ں����Լ�д��
		printList(integers);
		//��̭�㷨
		
		int j=0;//��Ҫ�Ƴ�ȥ��λ��
		
		for(int i=1;i<n;i++){
			System.out.println();
			System.out.println("��"+i+"����̭");
			//j�ı仯��m n �й� j��������Ҫ�Ƴ�ȥ��λ��
			j=(j+m-1)%(n-i+1);
			//�Ƴ� ���������LinkList���汾�����е�Ҳ����Integers���б��������Ƴ��̶�λ�õĶ���
			integers.remove(j);
			printList(integers);
		}
		System.out.println();
		//�Ƴ������Ժ��ֻʣһ���ˣ����Դ�ӡ����ĵ�һ��
		System.out.println("ʤ����Ϊ:"+integers.get(0));
	}
	//���������Լ�����Ĵ�ӡ�ķ���
	private static void printList(LinkedList<Integer> integers) {
		System.out.println("Լɪ��Ϊ��");
		for (Integer integer : integers) {
			System.out.print(integer+"��");
		}
	}
}




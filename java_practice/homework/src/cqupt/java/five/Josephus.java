package cqupt.java.five;

import java.util.LinkedList;

public class Josephus {
	private int n;//һ��������
	private int m;//��������
	private LinkedList<Integer> list = new LinkedList<Integer>();
	//һȦ�������ʱ��ų��е���
	private LinkedList<Integer> temp = new LinkedList<Integer>();
	/*
	 * ����Լɪ��
	 */
	public Josephus(int n,int m){
		this.n = n;
		this.m = m;
		for (int i = 1; i <= this.n; i++) {
			this.list.add(i);
		}
	}
	
	/*
	 * �ݹ� ִ������
	 *@param   lastΪ��һȦβ��δ�����˵ĸ���
	 * last��ֵΪ0
	 */
	public void start(int last){
		int size = list.size();//���ش��б�Ԫ����
		if(list.size() == 1){
			System.out.println(list.get(0)+" is winner��");
			return ;
		}
		for (int i = 1; i <= size; i++) {
			if((i+last)%m == 0){
				System.out.println(list.get(i-1)+" out");
				//�������˴������ʱ�б���
				temp.add(list.get(i-1));
			}
		}
		//ɾ����ʱ�б����
		for (Integer str : temp) {
			list.remove(str);
			}
		//���temp��������Ԫ��
		temp.clear();
		//�ݹ�
		//��һȦ last2 =��size-(m-last)��%m
		start((size+last)%m);	
	}
}

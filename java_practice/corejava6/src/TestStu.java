/**
 * 
 * @author Administrator
 *
 */
public class TestStu {

	public static void main(String[] args) {
	/*	Student zhangsan;
		
		//����ģ�� ����һ������ ��Ϊzhangsan 
		zhangsan= new Student();
		
		//ͨ��������ó�Ա���� Ϊ����洢����
		zhangsan.name = "zeng";
		zhangsan.tel = "15086";
		//zhangsan.age = 100;
		
		//ͨ��������÷���  ��ɹ���
		zhangsan.sayHello();
		
		//ͨ��������÷���  ��ɹ���
		int sum = zhangsan.add(1, 1);
		System.out.println("sum="+sum);
		System.out.println(zhangsan.age);
		System.out.println(zhangsan.sex);*/
		
		//���Թ��췽��   ����������ù��췽��  
		Student tom = new Student();
		System.out.println("tom="+tom.sum);
		
		Student jack = new Student(250);
		
		Student leo = new Student(100, "leo", "15086987");
		
		System.out.println(jack.sum);
		System.out.println(leo.tel);
		
		
		
	}

}

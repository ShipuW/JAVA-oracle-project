/**
 * 
 * @author Administrator
 * 
 */
public class Student {
	// ���� Ҳ�� ��Ա���� ʵ������    ���������ʱ�� �Զ���ʼ�� int ��ʼ��Ϊ0
	int sum;
	int age;
	String name;
	String tel;
	char sex = 'm';
	//���췽��  1.��������ͬ 2.û�з���ֵ   ���û����ʾ�ṩ���췽��  ϵͳ�Զ��ṩһ���޲εĹ��췽��
	//�����ʾָ���˹��췽��   ϵͳ�����ṩ�޲ι��췽��
	public Student(){
		System.out.println("���췽��");
	}
	//���췽������    
	public Student(int xh)
	{
		sum= xh;
	}
	//���췽������
	public  Student(int xh,String xm,String dh)
	{
		
		sum=xh;
		name=xm;
		tel=dh;
	}

	// ��Ա���� ʵ������
	public void sayHello() {
		System.out.println("hello");
	}

	// ��Ա���� ʵ������  ����ͨ��������õ�
	public int add(int a, int b) {
		return a + b;
	}

	// ��Ա����
	public void showAge() {
		int age = 990;
		System.out.print(age);
	}

	// ��Ա����
	public void showAge2() {
		System.out.print(age);
	}

}

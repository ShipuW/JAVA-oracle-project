import java.util.Random;

/**
 * 
 * @author Administrator
 * 
 */
public class ThreadTest implements Runnable {
	// ����˽�е����߳�
	private static ThreadLocal<Person> personlocal = new ThreadLocal<Person>();

	public static void main(String[] args) {
		ThreadTest t = new ThreadTest();
		Thread t1 = new Thread(t, "�߳�1");
		Thread t2 = new Thread(t, "�߳�2");
		t1.start();
		// t2.start();

	}



	@Override
	public void run() {
		String currentName = Thread.currentThread().getName();
		System.out.println("�õ���ǰ�̵߳�����" + currentName);
		// �õ������
		Random rand = new Random();
		int age = rand.nextInt(100);
		// ���߳��еõ��������
		Person person = personlocal.get();
		if (person == null) {
			// ���������Ϊ��ʱ�����������
			person = new Person();
			// ����ֵ
			person.setAge(age);
			// �������ŵ��߳���
			personlocal.set(person);
		}
		// �����������е�����
		System.out.println(currentName + "��һ�ζ�ȡ��������" + person.getAge());
		// ���߳�ֹͣ500
		try {
			Thread.sleep(500);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(currentName + "�ڶ��ζ�ȡ��������" + person.getAge());

	}
}

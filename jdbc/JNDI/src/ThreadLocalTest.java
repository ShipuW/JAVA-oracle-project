import java.util.Random;

/**
 * �̲߳����Ĳ���,������������� 1.ʵ��Runnable�߳�
 * 
 * @author Administrator
 * 
 */
public class ThreadLocalTest implements Runnable {
	private static Person person = null;

	public static void main(String[] args) {
		ThreadLocalTest test = new ThreadLocalTest();
		Thread t1 = new Thread(test, "���Ǿ���1");
		Thread t2 = new Thread(test, "���Ǿ���2");
		t1.start();
		t2.start();
	}

	@Override
	public void run() {
		String currentName = Thread.currentThread().getName();
		System.out.println("�õ���ǰ�̵߳�����" + currentName);
		Random rand = new Random();
		int age = rand.nextInt(100);
		if(person==null){
			person=new Person();
			person.setAge(age);
		}
		System.out.println(currentName + "��һ�ζ�ȡ��������" + person.getAge());
		try {
			Thread.sleep(500);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(currentName + "�ڶ��ζ�ȡ��������" + person.getAge());

	}
}

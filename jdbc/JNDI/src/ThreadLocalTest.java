import java.util.Random;

/**
 * 线程并发的操作,设置人类的年龄 1.实现Runnable线程
 * 
 * @author Administrator
 * 
 */
public class ThreadLocalTest implements Runnable {
	private static Person person = null;

	public static void main(String[] args) {
		ThreadLocalTest test = new ThreadLocalTest();
		Thread t1 = new Thread(test, "我是線程1");
		Thread t2 = new Thread(test, "我是線程2");
		t1.start();
		t2.start();
	}

	@Override
	public void run() {
		String currentName = Thread.currentThread().getName();
		System.out.println("得到当前线程的名称" + currentName);
		Random rand = new Random();
		int age = rand.nextInt(100);
		if(person==null){
			person=new Person();
			person.setAge(age);
		}
		System.out.println(currentName + "第一次读取人类年龄" + person.getAge());
		try {
			Thread.sleep(500);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(currentName + "第二次读取人类年龄" + person.getAge());

	}
}

import java.util.Random;

/**
 * 
 * @author Administrator
 * 
 */
public class ThreadTest implements Runnable {
	// 设置私有的线线程
	private static ThreadLocal<Person> personlocal = new ThreadLocal<Person>();

	public static void main(String[] args) {
		ThreadTest t = new ThreadTest();
		Thread t1 = new Thread(t, "线程1");
		Thread t2 = new Thread(t, "线程2");
		t1.start();
		// t2.start();

	}



	@Override
	public void run() {
		String currentName = Thread.currentThread().getName();
		System.out.println("得到当前线程的名称" + currentName);
		// 得到随机数
		Random rand = new Random();
		int age = rand.nextInt(100);
		// 从线程中得到人类对象
		Person person = personlocal.get();
		if (person == null) {
			// 当人类对象为空时创建人类对象
			person = new Person();
			// 设置值
			person.setAge(age);
			// 把人类存放到线程中
			personlocal.set(person);
		}
		// 输出人类对象中的年龄
		System.out.println(currentName + "第一次读取人类年龄" + person.getAge());
		// 让线程停止500
		try {
			Thread.sleep(500);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(currentName + "第二次读取人类年龄" + person.getAge());

	}
}

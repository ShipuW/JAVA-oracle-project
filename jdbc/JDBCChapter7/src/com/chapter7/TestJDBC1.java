package com.chapter7;

import java.util.Random;

/*
 * ThreadLacal的使用
 */
public class TestJDBC1 implements Runnable{
	//创建线程局部变量personLocal，用来保存Person对象
    private final static ThreadLocal<Person> personLocal = new ThreadLocal<Person>();
 
    public static void main(String[] agrs) {
    	TestJDBC1 tj = new TestJDBC1();
    	
        Thread t1 = new Thread(tj,"a");
        Thread t2 = new Thread(tj,"b");
        t1.start();
        t2.start();
    }
    public void run(){
    	//获取当前线程的名字
        String currentThreadName = Thread.currentThread().getName();
        System.out.println("线程'"+currentThreadName + "'正在运行!");
        //产生一个随机数并打印
        Random random = new Random();
        int age = random.nextInt(100);
        System.out.println("线程'" + currentThreadName + "'设置年龄:" + age);
        //从ThreadLocal对象中获取一个Person对象，并将随机数年龄插入到对象属性中
        Person person = personLocal.get();
        //线程首次执行此方法的时候，personLocal.get()肯定为null
        if (person == null) {
            //创建一个Person对象，并保存到本地线程变量personLocal中
        	person = new Person();
        	person.setAge(age);
        	personLocal.set(person);
        }
        System.out.println("线程'" + currentThreadName + "'第一次读年龄:" + personLocal.get().getAge());
        try {
            Thread.sleep(500);
        }
        catch (InterruptedException ex) {
            ex.printStackTrace();
        }
        System.out.println("线程'" + currentThreadName + "'第二次读年龄:" + personLocal.get().getAge());
    }
}
package com.chapter7;

import java.util.Random;

/*
 * ThreadLacal��ʹ��
 */
public class TestJDBC1 implements Runnable{
	//�����ֲ߳̾�����personLocal����������Person����
    private final static ThreadLocal<Person> personLocal = new ThreadLocal<Person>();
 
    public static void main(String[] agrs) {
    	TestJDBC1 tj = new TestJDBC1();
    	
        Thread t1 = new Thread(tj,"a");
        Thread t2 = new Thread(tj,"b");
        t1.start();
        t2.start();
    }
    public void run(){
    	//��ȡ��ǰ�̵߳�����
        String currentThreadName = Thread.currentThread().getName();
        System.out.println("�߳�'"+currentThreadName + "'��������!");
        //����һ�����������ӡ
        Random random = new Random();
        int age = random.nextInt(100);
        System.out.println("�߳�'" + currentThreadName + "'��������:" + age);
        //��ThreadLocal�����л�ȡһ��Person���󣬲��������������뵽����������
        Person person = personLocal.get();
        //�߳��״�ִ�д˷�����ʱ��personLocal.get()�϶�Ϊnull
        if (person == null) {
            //����һ��Person���󣬲����浽�����̱߳���personLocal��
        	person = new Person();
        	person.setAge(age);
        	personLocal.set(person);
        }
        System.out.println("�߳�'" + currentThreadName + "'��һ�ζ�����:" + personLocal.get().getAge());
        try {
            Thread.sleep(500);
        }
        catch (InterruptedException ex) {
            ex.printStackTrace();
        }
        System.out.println("�߳�'" + currentThreadName + "'�ڶ��ζ�����:" + personLocal.get().getAge());
    }
}
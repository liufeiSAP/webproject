package com.deppon.test04.test;

import java.util.concurrent.TimeUnit;

public class ThreadTest implements Runnable {
	
	private String name;
	public ThreadTest(String name)
	{
		this.name = name;
	}
	
	public void run() {
		System.out.println(name + "start");
		try {
			TimeUnit.SECONDS.sleep(4);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(name + "end");
	}

	public static void main(String[] args) {
		Thread t1 = new Thread(new ThreadTest("t1"));
		Thread t2 = new Thread(new ThreadTest("t2"));
		
		
		t1.start();
		t2.start();
		
		try {
			t1.join();
			t2.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		 System.out.println("Main thread is finished");
	}
}

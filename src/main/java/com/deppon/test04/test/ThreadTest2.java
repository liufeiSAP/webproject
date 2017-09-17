package com.deppon.test04.test;

import java.util.concurrent.TimeUnit;

public class ThreadTest2 {

	public static void main(String[] args) {
		final Thread t1 = new Thread(new Runnable(){
			public void run() {
				System.out.print("t1 begin \r\n");
				try {
					TimeUnit.SECONDS.sleep(5);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				System.out.print("t1 end \r\n");
			}
		});
		
		
		Thread t2 = new Thread(new Runnable(){
			public void run() {
				System.out.print("t2 begin \r\n");
				try {
					t1.join();
				} catch (InterruptedException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				System.out.print("t2 aaaaaaaaaaaaaa \r\n");
				try {
					TimeUnit.SECONDS.sleep(5);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				System.out.print("t2 end \r\n");
			}
		});
		
		t1.start();
		t2.start();
		try {
			t2.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.print("main end");
		
	}
}

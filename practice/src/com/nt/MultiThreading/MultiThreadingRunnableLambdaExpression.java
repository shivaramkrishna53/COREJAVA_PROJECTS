package com.nt.MultiThreading;
public class MultiThreadingRunnableLambdaExpression {

	public static void main(String[] args)  throws Exception{
		System.out.println("main thread" + Thread.currentThread().getName());
		Thread t1 = new Thread(() -> {
			System.out.println("tr1 thread:" + Thread.currentThread().getName());
			for (int j = 1; j <= 10; j++) {
				try {
					Thread.sleep(1000);
					System.out.println("hi");
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		},"Hi Thread");
		Thread t2 = new Thread(() -> {
			System.out.println("tr2 thread:" + Thread.currentThread().getName());
			for (int j = 1; j <= 10; j++) {
				try {
					Thread.sleep(1000);
					System.out.println("hellow");
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		},"Hellow Thread");
		t1.start();
		t2.start();
		
//		t1.setName("thread t1");
//		t2.setName("Thread t2");
		
		t1.setPriority(1);
		t2.setPriority(10);
		System.out.println(Thread.currentThread().getName());
		
		System.out.println(t1.getPriority());
		System.out.println(t2.getPriority());
		
		System.out.println(t1.getName());
		System.out.println(t2.getName());
		
		t1.join();
		t2.join();
		System.out.println("Byee");
	}
}

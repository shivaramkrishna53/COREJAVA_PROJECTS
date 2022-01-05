package com.nt.MultiThreading;

class parent {
	public void m() {
		System.out.println("This is parent class method");
	}
}

class a extends parent implements Runnable {

	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("inside a class thread is::" + Thread.currentThread().getName());

		for (int i = 1; i <= 10; i++) {
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println("hi");
		}

	}

}

class b implements Runnable {
	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("Class b thread is::" + Thread.currentThread().getName());

		for (int j = 1; j <= 10; j++) {
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println("hello");
		}
	}
}
public class MultithreadingUsingRunnable {

	public static void main(String[] args) throws Exception{
		Runnable r1 = new a();
		Runnable r2 = new b();
		Thread t1 = new Thread(r1);
		Thread t2 = new Thread(r2);
		t1.start();
		t2.start();
		
		t1.join();
		t2.join();
		
		System.out.println(t1.isAlive());
		System.out.println("Byee");
	}
}

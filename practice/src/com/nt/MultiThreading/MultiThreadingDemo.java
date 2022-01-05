package com.nt.MultiThreading;

class Hello extends Thread
{
	public void run() 
	{
		System.out.println(Thread.currentThread().getName());
		for(int i=1;i<=10;i++)
		{
		System.out.println("Hellow");
		try {
		Thread.sleep(1000);
		}
		catch (Exception e) {
			System.out.println(e);
		}
		}
	}
	
}

class Hi extends Thread
{
	
	public void run()
	{
		System.out.println(Thread.currentThread().getName());
		for(int i=1;i<=10;i++)
		{
		System.out.println("Hi");
		try {
			Thread.sleep(1000);
			}
			catch (Exception e) {
				System.out.println(e);
			}
		}
	}
}


public class MultiThreadingDemo {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.out.println(Thread.currentThread().getName());
		Hello he=new Hello();
		Hi h=new Hi();
		he.start();
		Thread.sleep(10);
		h.start();
		System.out.println("Main thread executing its way");
		Thread.sleep(1000);
		System.out.println("Three threads are executing parllelly");
		
		

	}

}

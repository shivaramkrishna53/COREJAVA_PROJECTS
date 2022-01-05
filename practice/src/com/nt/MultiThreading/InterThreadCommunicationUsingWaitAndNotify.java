package com.nt.MultiThreading;
/*
 * Wait: Wait() is used in order to wait for other thread's execution and once the other thread notify's then it can start its execution.
 * Notify: Notify() is used to notify that it has done with its execution and tells the waiting thread to resume its execution.
 */

class values
{
	int num;
	boolean isset=false;
	

	public synchronized void getNum() {
		if(isset)
		{
			System.out.println("Get:"+num);
			isset=false;
			notify();
		}
		else
		{
			try {
				wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
		
	}

	public synchronized void setNum(int num) {
		
		if(isset)
		{
			try {
				wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		else {
		System.out.println("Set:"+num);
		this.num = num;
		isset=true;
		notify();
		}
	}

	
}

class producer implements Runnable
{
	values v;
 public producer(values v)
 {
	this.v=v;	
 }

	@Override
	public void run() {
		int i=0;
		while(true)
		{
			v.setNum(++i);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}
	
}

class consumer implements Runnable
{
	values v;
	
	public consumer(values v)
	{
		this.v=v;
	}
	
	public void run()
	{
		while(true)
		{
			v.getNum();
			try {
				Thread.sleep(5000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
}


public class InterThreadCommunicationUsingWaitAndNotify {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		values v=new values();
		Thread t1=new Thread(new producer(v));
		Thread t2=new Thread(new consumer(v));
		
		t1.start();
		t2.start();
		
		
		

	}

}

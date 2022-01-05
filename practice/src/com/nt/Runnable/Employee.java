package com.nt.Runnable;

public class Employee {
	
	 synchronized public void display()
	{
		for(int i=0;i<10;i++)
		{
			System.out.println(i+"using the thread::"+Thread.currentThread().getName());
		    try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

}

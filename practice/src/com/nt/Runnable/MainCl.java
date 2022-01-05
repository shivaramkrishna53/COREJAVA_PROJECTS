package com.nt.Runnable;

public class MainCl {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Main thread"+Thread.currentThread().getName());
		//thread t1
		Employee e=new Employee();
		Thread t1=new Thread(new Runnable() {
			
			@Override
			public void run() {
				e.display();
				
			}
		});  //just used the annanomoys inner class
		t1.start();
		Thread t2=new Thread(new CreateThread(e));
		t2.start();

	}

}

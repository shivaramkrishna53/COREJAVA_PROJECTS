package com.nt.Runnable;

public class CreateThread  implements Runnable{

	Employee e;
	public CreateThread(Employee e)
	{
	   this.e=e;	
	}
	
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		
		e.display();
		
	}

}

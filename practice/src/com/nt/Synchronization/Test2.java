package com.nt.Synchronization;

// if there are synchronized and non synchronized non static methods then if any one thread access the synchronized method then other threads are not allowed to access any synchroniized non static methods whereas they can access the non synchronized nonstatic methods simentanously.

class institutes
{
	synchronized public void classroom(String fac)
	{
		for(int i=1;i<=10;i++)
		{
			System.out.println("Classroom is taken from"+i+" hrs by facutly"+ fac);
		}
		
	}
	
	 public void exam(String fac)
	{
		for(int i=1;i<=10;i++)
		{
			System.out.println("Exam is writing from"+ i +"  hrs by facutlty"+fac);
		}
		
	}
	
	
}

class userdefinedthread extends Thread
{
	institutes ins;
	String fac;
	
	@Override
	public void run() {
		ins.classroom(fac);
		
	}
	
	public userdefinedthread(institutes ins,String fac)
	{
		this.ins=ins;
		this.fac=fac;
		
		
	}
}


public class Test2 extends Thread {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		institutes ins=new institutes();
		userdefinedthread t1=new userdefinedthread(ins, "hk");
		userdefinedthread t2=new userdefinedthread(ins, "natraj");
		t1.start();
		t2.start();
		
	ins.exam("ramchandra");
		
		
		
		
		

	}

}

package com.nt.Synchronization;

/*
 Synchronization in Java

The process of allowing only one thread by jvm to access the resource(objects method,block) and complete the process/task is called synchronization

If there is no synchronization applied then there may be chances of having inconsistency of data.
Eg: if there are 5 tickets and there are 10users accesss for ticket booking, if synchronization is not applied here we may end up having data consistency
It is best that we use synchronization concept here. So that until one thread completed the executiion only other thread gets chance.

Synchronization works on the concept of locking mechinism, where the particular resource is locked by that thread util the executiion is completed

Synchronization can by done using the key word Synchronized.. It can only be applied to methods and blocks.

The drawback of synchronization is poor performance as the threads need to wait until the complete execution of one thread. i.e if suppose there are 5 threads accessiing a synchronized 
method then only 1 threead can access that method... the remaining 4 need to wait until the completion... Thus response time is more.

So synchronization is only applied on those methods whose status is keep on updating so that data inconsistency problems are solved.


 */
//basic program on synchronization
class Institute
{
	synchronized public void classroom(String faculty)
	{
		for(int i=1;i<=10;i++)
		{
			System.out.println(i+ "Taking class by the faulty::"+faculty);
			
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		
		
	}
	
}

//creating user defined threads

class userdefinedthreads extends Thread
{
	Institute ins;
	String faculty;
	@Override
	public void run()
	{
		ins.classroom(faculty);
	}
	public userdefinedthreads(Institute ins,String facutly)
	{
		this.ins=ins;
		this.faculty=facutly;
		
	}
}



public class Test{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Institute ins=new Institute();
		userdefinedthreads t1=new userdefinedthreads(ins, "harikrishna");
		userdefinedthreads t2=new userdefinedthreads(ins, "naveen");
		t1.start();
		t2.start();
		
		

	}

}

package com.nt.AnanoyoumsClss;

class abcd
{
	public void m()
	{
		System.out.println("Good Morning");
	}
}

class efgh extends abcd
{
	public void m()
	{
		System.out.println("Good Evening");
	}
}

interface trai
{
	void technology();
}

class airtel implements trai
{
	public void technology()
	{
		System.out.println("airtel has 4g technogly");
	}
}




public class AnonomyousClssDemo {

	public static void main(String[] args) {
		
		abcd obj=new abcd() {    //anonomoys clss is a clss with no name, which is mainly used for overriding or implementng the super class methods
			public void m()
			{
				System.out.println("Goood night");
			}
			
		};
		obj.m();
		
		
		trai operator2=new trai() {
			public void technology()
			{
				System.out.println("Operator2 uses 5g technology");
			}
		};
		operator2.technology();
		
		/*
		 * trai operator1=new airtel(); 
		 * operator1.technology();
		 */
		
		
	  
		
		
		
		//below is the example of Anonomoys for Runnable interface
		
		Runnable rn=()->{
				System.out.println("thread started");
				
			};
		
	}

}

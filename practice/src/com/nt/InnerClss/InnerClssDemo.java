package com.nt.InnerClss;

import com.nt.InnerClss.outer.inner;

class outer
{
	static int a;
	
	public static void m() {};
	static class inner
	{
		
		public void display() 
		{
			System.out.println("inside innerclss disply");
		}
	}
	
	
}


public class InnerClssDemo {

	public static void main(String[] args) {
		
		outer obj=new outer();
		obj.a=10;
		obj.m();
		outer.inner obj1=new outer.inner();
		obj1.display();
	}

}

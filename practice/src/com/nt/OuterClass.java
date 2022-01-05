package com.nt;

import com.nt.OuterClass.StaticInnerClass;

public class OuterClass {
	
	int a=200;
	static int b=10;
	private static int c=20;
	
	static class StaticInnerClass
	{
		public void disp()
		{
			System.out.println("b val is::"+b);
			System.out.println("c val is:"+c);
		
			
		}
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		StaticInnerClass slc=new StaticInnerClass();
		OuterClass.StaticInnerClass sl=new OuterClass.StaticInnerClass();
		sl.disp();
		slc.disp();
		

	}

}

package com.nt.ExceptionHandling;

public class ExceptionPropagation {

	
		public void m1()
		{
			int d=10/0;
		}
		public void m2()
		{
			m1();
		}
		public void m3()
		{
			try
			{
			m2();
			}
			catch(Exception e)
			{
				e.printStackTrace();
			}
		
			
		}
		public static void main(String[] args) {
			// TODO Auto-generated method stub
			ExceptionPropagation ep=new ExceptionPropagation();
			ep.m3();

	}

}

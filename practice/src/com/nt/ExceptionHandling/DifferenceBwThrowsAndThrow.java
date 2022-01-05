package com.nt.ExceptionHandling;

public class DifferenceBwThrowsAndThrow {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DifferenceBwThrowsAndThrow dtt=new DifferenceBwThrowsAndThrow();
		
		dtt.m2();
		
		System.out.println("Normal applictioon flow");
		

	}
	
	public void m1() 
	{
		throw new NumberFormatException("Enter valid string no.");
		
	}
	public void m2() 
	{
		try {
		m1();
		}
		catch(Exception e)
		{
			System.out.println("Exception handled");
			System.out.println(e);
		}
	}

}

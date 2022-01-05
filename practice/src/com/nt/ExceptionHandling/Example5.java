package com.nt.ExceptionHandling;

import java.util.Scanner;

public class Example5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		try
		{
			try 
			{
				
			int a=10/0;
			
			}
			catch(NumberFormatException ne)
			{
				
				System.out.println("Inside nested tryblock"+ne);
			}
			System.out.println("Remaiing logic of inner try blck");
		}
		catch(ArrayIndexOutOfBoundsException ae)
		{
			System.out.println("Inside ouoter try block"+ae);
		}
		finally{
		System.out.println("finally block");
		
		System.out.println("Enter the String in number");
		String num=sc.next();
		try {
			int w=Integer.parseInt(num);
			if(w==0)
				throw new ArithmeticException();
			
			
		}
		
		catch(ArithmeticException ar)
		{
			System.out.println("Inside arithematic excception");
			throw new NumberFormatException("Explicitlity messgae");
		}
		catch(NumberFormatException nws)
		{
			
			System.out.println("Inside NumberFormat exception");
			
		}
		finally
		{
			System.out.println("inside 2nd finally");
		}
			
		
		}

	}

}

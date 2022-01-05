package com.nt.ExceptionHandling;

public class Example3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try
		{
			int[] arr=new int[2];
			arr[3]=10/0;
			
			
		}
		
		
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println(e);
		}
		catch(ArithmeticException ae)
		{
			System.out.println(ae);
		}
		
		catch(Exception ew)
		{
			System.out.println(ew);
		}
		System.out.println("Remaining statements");

	}

}

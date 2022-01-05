package com.nt.ExceptionHandling;

public class Example6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
		int age=17;
		if(age<18)
			throw new ArrayIndexOutOfBoundsException("Age is less than 18");
		}
		
		catch(ArrayIndexOutOfBoundsException are)
		{
//			throw new ArithmeticException(are.getMessage());
			System.out.println("inside are::"+are.getMessage());
			
		}
		
		finally {
			System.out.println("Inside finally");
		}
		System.out.println("remainig logics");
//		catch(ArithmeticException a)
//		{
//			System.out.println("Inside arithemetic exception");
//			System.out.println(a);
//		}

	}

}

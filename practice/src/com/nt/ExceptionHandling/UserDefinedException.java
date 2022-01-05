package com.nt.ExceptionHandling;

public class UserDefinedException extends Exception{
	
	public UserDefinedException(String msg)
	{
		
		super(msg);
		System.out.println("Inside userdefined exception class");
	}

}

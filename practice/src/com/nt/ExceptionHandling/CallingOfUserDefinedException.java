package com.nt.ExceptionHandling;

import java.util.Scanner;

public class CallingOfUserDefinedException {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name=null;
		Scanner sc=new Scanner(System.in);
		try
		{
			System.out.println("Enter the name::");
			name=sc.nextLine();
			if(name.length()==1)
				throw new UserDefinedException("Name cannot be Empty");
		}
		catch(UserDefinedException ude)
		{
			System.out.println("inside catch block");
			System.out.println(ude.getMessage());
		}
		System.out.println("Remaining code");

	}

}

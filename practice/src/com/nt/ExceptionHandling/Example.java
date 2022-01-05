package com.nt.ExceptionHandling;

import java.util.Scanner;

public class Example {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		 String name=null;
		 Scanner sc=new Scanner(System.in);
		Example e=new Example();
		try {
			e.disp2(name);
		} catch (Exception e1) {
			// TODO Auto-generated catch block
			System.out.println(e1.getMessage());
			System.out.println("Pls change the name now:");
			String nam=sc.nextLine();
			e.disp2(nam);
			
		}
		
		

	}
	
	
	
	public void disp2(String name) //throws Exception
	{
		if(name==null)
			name.length();
			//throw(new NullPointerException("NullValueisn'tAllowed"));
			
		
			System.out.println(name);
		
	}

}

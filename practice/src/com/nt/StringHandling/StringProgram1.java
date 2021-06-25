package com.nt.StringHandling;

import java.util.Scanner;

public class StringProgram1 {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		String s1,s2;
		System.out.println("Enter the s1 and s2 string values:");
		s1=sc.nextLine();
		s2=sc.next();
		
		String s3=s1+s2;
		System.out.println(s3);
		System.out.println("Length of the string:"+s3.length());
		System.out.println(s3.toUpperCase());
		
	}
	
	
	
}

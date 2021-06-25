package com.nt.StringHandling;

import java.util.Scanner;

public class ConvertIntegerToStringAndStringToInteger {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the string that needs to convert to integer:");
		String s=sc.next();
		int num=Integer.parseInt(s);
		System.out.println(num+2);
		String w=String.valueOf(num);
		System.out.println(w+" hi");
		
		String s1="java";
		String s2=s1;
		s1="java"+"jee";
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s1.hashCode());
		System.out.println(s2.hashCode());
		
		
	}
}

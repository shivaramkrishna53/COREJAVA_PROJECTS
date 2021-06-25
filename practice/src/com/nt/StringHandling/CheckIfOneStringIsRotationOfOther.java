package com.nt.StringHandling;

import java.util.Scanner;

public class CheckIfOneStringIsRotationOfOther {
	public static void main(String[] args) {
	
	Scanner sc=new Scanner(System.in);
	String str="javajeespring";
	System.out.println("Enter the roation string u want to chk:");
	String rotchkwrd=sc.next();
	String str2=str+str;
	boolean flag=false;
	if(rotchkwrd.length()==str.length())
		flag=true;
	if(flag)
	{
		if(str2.contains(rotchkwrd))
			flag=true;
		else
		flag=false;
	}
	
	if(flag)
		System.out.println("It is a roational string");
	else
		System.out.println("It is not a rotational string");
	
	}
}

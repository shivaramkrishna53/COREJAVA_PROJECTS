package com.nt.StringHandling;

import java.util.Arrays;
import java.util.Scanner;

public class StringIsAnagramOrNot {

	
	
	//example of anagram-->school master::the classroom
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the first String::");
		String s1=sc.nextLine();
		System.out.println("Enter the second String::");
		String s2=sc.nextLine();
		s1=s1.trim().replace(" ", "").toLowerCase();
		char[] charr1=s1.toCharArray();
		Arrays.sort(charr1);
		s2=s2.trim().replace(" ", "").toLowerCase();
		char[] charr2=s2.toCharArray();
		Arrays.sort(charr2);
		boolean flag=Arrays.equals(charr1, charr2);
		System.out.println(charr1);
		System.out.println(charr2);
		if(flag)
			System.out.println("It is a anagram");
		else
			System.out.println("It is not a anagram");
		
		
		
		
		
	}
	
	
}

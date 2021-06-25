package com.nt.StringHandling;

import java.util.Scanner;

public class ReverseEachWordInAString {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the string:");
		String s=sc.nextLine();
		//Java Concept Of The Day
		//avaJ tpecnoC fO ehT yaD
		
		String[] words=s.split(" ");
		String result="";
		
		for(String word:words)
		{
			StringBuffer sb=new StringBuffer(word);
			sb=sb.reverse();
			result+=sb.toString();
			result+=" ";
		}
		System.out.println(result);
	}
}

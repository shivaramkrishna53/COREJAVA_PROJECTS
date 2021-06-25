package com.nt.StringHandling;

import java.util.Scanner;

public class NoOfOccurancesOftheCharacterWithoutForLoop {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String str="shiva ram krishna";
	    int len1=str.length();
	    System.out.println("Enter the character to be find its occurance:");
	    String ch=sc.next();
		int len2=str.replace(ch,"").length();
		System.out.println("No. of character found for the:"+ch+ " are::"+(len1-len2));
		
	}
}

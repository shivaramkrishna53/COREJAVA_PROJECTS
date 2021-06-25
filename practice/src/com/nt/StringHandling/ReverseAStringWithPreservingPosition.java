package com.nt.StringHandling;

import java.util.Scanner;

public class ReverseAStringWithPreservingPosition {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		//I Am Not String
		//g ni rtS toNmAI
		
		System.out.println("Enter the String::");
		String input=sc.nextLine();
		char[] inputcharr=input.toCharArray();
		
		char[] resultcharr=new char[inputcharr.length];
		
		for(int i=0;i<inputcharr.length;i++)
		{
			if(inputcharr[i]==' ')
				resultcharr[i]=' ';
		}
		int j=resultcharr.length-1;
		for(int i=0;i<inputcharr.length;i++)
		{
			if(inputcharr[i]!=' ')
			{
				if(resultcharr[j]==' ')
					j--;
				
				resultcharr[j]=inputcharr[i];
				j--;
			}
		}
		System.out.println(resultcharr);
		
		
		
		
		
		
		
		
		
		
		
//		for(int i=s.length()-1;i>=0;i--)
//		{
//			
//			
//			if( j<s.length() && s.charAt(j)==' ')
//			{
//				
//				revs+=" ";
//				i++;
//				
//				System.out.println(revs);
//			}
//			
//			else
//			{
//				if(s.charAt(i)!=' ')
//				{
//				revs+=s.charAt(i);
//				System.out.println(revs);
//				}
//				
//			}
//			
//			
//			j++;
//		}
//		
		
		
	}
}

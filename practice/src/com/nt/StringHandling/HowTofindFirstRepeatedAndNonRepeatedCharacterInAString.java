package com.nt.StringHandling;

import java.util.LinkedHashMap;
import java.util.Scanner;
import java.util.Set;

public class HowTofindFirstRepeatedAndNonRepeatedCharacterInAString {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		//shivaramkrishna
		//first repeated--->s
		//first non repeated--->v
		
		System.out.println("Enter the String::");
		String s=sc.nextLine();
		char[] charr=s.toCharArray();
		LinkedHashMap<Character,Integer> hm=new LinkedHashMap<Character, Integer>();
		for(char ch:charr)
		{
			if(hm.containsKey(ch))
				hm.put(ch,hm.get(ch)+1);
			else
				hm.put(ch,1);
		}
		
		
		
		for(char ch:charr)
		{
			
			if(hm.get(ch)==1)
			{
				System.out.println("The first non-repeated character is:"+ch);
				break;
			}
			
		}
		
		for(char ch:charr)
		{
			if(hm.get(ch)>1)
			{
				System.out.println("The first repeated character is:"+ch);
			    break;
			}
		}
	}
}

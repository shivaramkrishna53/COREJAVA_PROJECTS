package com.nt.StringHandling;

import java.util.LinkedHashMap;
import java.util.Scanner;

public class ToFindTheLongestSubStringWithoutRepeatingOfCharacters {

	
	//ip:  javaconceptoftheday     
	//op:  oftheday
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the string::");
		String ip=sc.nextLine();
		LinkedHashMap<Character,Integer> hm=new LinkedHashMap<Character, Integer>();
		char[] charr=ip.toCharArray();
		int longestsubstringlen=0;
		String longestsubstring=null;
		
		for(int i=0;i<charr.length;i++)
		{
			char ch=charr[i];
			
			if(!hm.containsKey(ch))
				hm.put(ch, i);
			
			else
			{
				i=hm.get(ch);
				hm.clear();
			}
			
			if(hm.size()>longestsubstringlen)
			{
				longestsubstring=hm.keySet().toString();
				longestsubstringlen=hm.size();
			}
			
			
		}
		System.out.println(longestsubstring);
	}
	
	
	
	
}

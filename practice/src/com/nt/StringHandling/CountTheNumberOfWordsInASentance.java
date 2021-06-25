package com.nt.StringHandling;

public class CountTheNumberOfWordsInASentance {

	public static void main(String[] args) {
		//1st way:using split() of string class to get the count of the words
//		String s="      shiva is a java developer  ";
//	    String[] words=s.trim().split(" ");
//	    System.out.println(words.length);
//	    
	    //2nd way:using logic
		String s="shiva is a java developer  ";
	    int count=0;
		for(int i=0;i<s.length()-1;i++)
		{
			if(s.charAt(i)==' ' && s.charAt(i+1)!=' ')
			{
				count++;
			}
		}
		System.out.println(count+1);
	}
}

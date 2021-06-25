package com.nt.StringHandling;

public class ReversingAString {
	
	public static void main(String[] args) {

//		//1st way: using custom logic
//		String word="enter";
//		String revword="";
//		
//		for(int i=word.length()-1;i>=0;i--)
//		{
//			revword+=word.charAt(i);
//		}
//		System.out.println(word);
//		System.out.println(revword);
//		System.out.println(word.length());
//		System.out.println(revword.length());
		
//		2nd way: using string api(String builder)
		String word="enter";
		String revword="";
		
		StringBuffer sb=new StringBuffer(word);
		revword=sb.reverse().toString();
		System.out.println(word);
		System.out.println(revword);
		
		String abc="hellow world happy";
		abc=abc.replace(" ", "");
		System.out.println(abc);
		
		

}
}

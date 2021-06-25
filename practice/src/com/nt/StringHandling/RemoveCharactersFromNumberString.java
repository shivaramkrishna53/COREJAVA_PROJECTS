package com.nt.StringHandling;

public class RemoveCharactersFromNumberString {

	public static void main(String[] args) {
		
		String mobile="9866@ba007$!*96cas6";
		//expected o/p:mobile="9866007966"
		
		StringBuffer sb=new StringBuffer(mobile);
		for(int i=0;i<sb.length();i++)
		{
			if(sb.charAt(i)<'0' || sb.charAt(i)>'9')
			{
				sb.deleteCharAt(i);
				i--;
			}
		}
		System.out.println(sb); 
	}
	
	
}

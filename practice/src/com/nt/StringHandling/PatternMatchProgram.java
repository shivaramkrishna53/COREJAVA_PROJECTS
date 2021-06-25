package com.nt.StringHandling;

public class PatternMatchProgram {

	public static void main(String[] args) {
		

	//pattern match can be done using two ways: 1.using contains() method of String class
	//2.By using logic and imlement
	
	//1.Using contains
	
	
	String text="Shiva Ram Krishna";
	String pattern="ram";
	text=text.toLowerCase();
	pattern=pattern.toLowerCase();
	
//	Boolean res=text.contains(pattern);
//	if(res)
//		System.out.println("Pattern found");
//	else
//		System.out.println("Pattern not Found");
	
	
	//2.Using logic
	int cp=pattern.length();
	int count;
	boolean flag=false;
	for(int i=0;i<=text.length()-pattern.length();i++)
	{
		
		count=0;
		int j=i;
		int k=0;
		while( k<cp && (text.charAt(j)==pattern.charAt(k)) )
		{
			count++;
			j++;
			k++;
		}
		if(count==cp)
		{
			flag=true;
			break;
		}
	}
	
	if(flag)
		System.out.println("Pattern found");
	else
		System.out.println("Patttern not found");
	
	
	
	
		
	
	
	
	}
}

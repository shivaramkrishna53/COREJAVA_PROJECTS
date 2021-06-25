package com.nt.java8features;

import java.util.Arrays;
import java.util.List;

interface phones
{
	public String sarvaluepassingforcalculation(int value);
}

class logicofphonesardecision
{
	public static String calsar(int value)
	{
		
		if(value<=2)
			return "yes";
		else
			return "no";
	}
}

 class ShouldWeBuyThatPhone
{

	 public void buyornot(int value,phones ph)
	 {
		String decision=ph.sarvaluepassingforcalculation(value);
		if(decision.equalsIgnoreCase("yes"))
			System.out.println("Buy that phone");
		else
			System.out.println("Don't buy that phone as it has high sar value");
	 }
}

public class MethodReferenceInJava8 {
	
	//method reference is nothing but a replacement/simpler form for a lamda expression
	
	
	
	
	
	public static void main(String args[])
	{
	//1.Example 1:
	
	List<Integer> lst=Arrays.asList(1,2,3,4);
	
	//using foreach method for iterating and printing
	//lst.forEach(i->System.out.println(i));
	
	//instead of i->syso(i) we can go for method reference
	
	lst.forEach(System.out::println);
	
	//2.Example 2:
	
	ShouldWeBuyThatPhone sp=new ShouldWeBuyThatPhone();
//	sp.buyornot(10, (int value)->{
//		
//		return logicofphonesardecision.calsar(value);
//			
//		}
	//instead of the above statement we can go for the below one
	
	sp.buyornot(1, logicofphonesardecision::calsar);
	
	
	
	
			
	

	}
}

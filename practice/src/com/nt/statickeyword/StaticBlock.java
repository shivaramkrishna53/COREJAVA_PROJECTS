package com.nt.statickeyword;

public class StaticBlock {

	//A static block is that which gets executed at the time of class loading into jvm
	//The use of static block is if i want to initialize any varibles without creating instance/object before main method call then we go for static  block
	
	static String s="";
	static
	{
		System.out.println("static block1");
		s="abcd";
		
	}
	public static void main(String[] args) {
		System.out.println("main method");
		System.out.println(StaticBlock.s);
	}
	
	static
	{
		System.out.println("static block2");
	}
	
	
}

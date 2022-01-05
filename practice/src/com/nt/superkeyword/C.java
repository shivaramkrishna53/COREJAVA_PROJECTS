package com.nt.superkeyword;

class A {

	A()
	{
		
		System.out.println("in A constructor");
	}
	A(int x)
	{
		System.out.println("in int A constructor");
		
	}
}

class B extends A
{
	
	B()
	{
		super(10);
		System.out.println("in B constructor");
	}
	
	B(int y)
	{
		super(y);
		System.out.println("in int B constructor");
		
	}
	
}

public class C
{
	public static void main(String args[])
	{
		B obj=new B();
	}
}


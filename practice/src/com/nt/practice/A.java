package com.nt.practice;

public class A {
	
	int i=5;
	int j=10;

	public static void main(String args[]) throws CloneNotSupportedException
	{
		A obj1=new A();
		obj1.i=20;
		obj1.j=500;
		System.out.println(obj1.i +"   "+obj1.j);
		
//		A obj2=obj1;
//		System.out.println(obj2.i +"   "+obj2.j);
//		obj2.i=30;
//		System.out.println(obj1.i +"   "+obj1.j);
//		System.out.println(obj2.i +"   "+obj2.j);
		
//		A obj2=new A();
//		System.out.println(obj2.i +"   "+obj2.j);
//		obj2.i=50;
//		obj2.j=100;
//		System.out.println(obj1.i +"   "+obj1.j);
//		System.out.println(obj2.i +"   "+obj2.j);
		
		A obj2=new A();
		obj2.i=obj1.i;
		obj2.j=obj1.j;
		
		System.out.println(obj2.i+" "+obj2.j);
		

	}
}

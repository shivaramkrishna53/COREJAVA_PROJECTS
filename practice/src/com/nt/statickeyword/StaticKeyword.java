package com.nt.statickeyword;

public class StaticKeyword {
	
	//The static is a keyword in java, if we apply static to any class variable or class function then that can be called without creating the instance.
	
	
	static int w=100;
	int q=10;
	public void fun1()
	{
	System.out.println(w);
		
		int a=10;
		System.out.println(a);
		System.out.println("This is a non static function");
	}
	
	public static void fun2()
	{
		System.out.println(w);
		System.out.println("This is a static function");

	}
	
	
public static void main(String[] args) {
		
		StaticKeyword.fun2();
		StaticKeyword.w=500;
		StaticKeyword sk=new StaticKeyword();
		System.out.println(sk.q);
		sk.fun1();
		sk.fun2();
		System.out.println(w);
	}
	

}

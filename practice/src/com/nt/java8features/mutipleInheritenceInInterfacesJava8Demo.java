package com.nt.java8features;

interface abcde
{
	 void m1();
	 public default void m2()
	 {
		 System.out.println("abc's m2");
	 }
}

interface fghi
{
	void m1();
	
	public default void m2()
	 {
		 System.out.println("fghi's m2");
	 }
	
}

class klm implements abcde,fghi
{
	public void m1()
	{
		System.out.println("m1 method");
	}
	
	public void m2()  //if there are 2 default methods defined in the 2 interfaces then inorder to remove the error we need to ovverride the default method
	{
		fghi.super.m2();
	}
}



public class mutipleInheritenceInInterfacesJava8Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		klm obj=new klm();
		obj.m1();
		obj.m2();
		

	}

}

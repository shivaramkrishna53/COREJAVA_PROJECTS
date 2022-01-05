package com.nt.java8;

interface I1 {
	public void m2();
	public static void m1()
	{
		System.out.println("inside m1 static mehtod");
	}
	
	public default void show()
	{
		System.out.println("Inside I2 interface");
	}
//	public default String toString() //inside interface we cannot ovveride the Object class methods it throws error
//	{
//		return "abc";
//	}
}

interface I2 {

	public default void show()
	{
		System.out.println("Inside I2 interface");
	}
}

class a  implements I1,I2  {
	
	public  void show()
	{
		System.out.println("Inside I2 interface");
	}

	@Override
	public void m2() {
		// TODO Auto-generated method stub
		
	}
}

public class DefaultAndStaticInterfacesDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		a obj = new a();
		obj.show();
		obj.m2();
		I1.m1();

	}

}

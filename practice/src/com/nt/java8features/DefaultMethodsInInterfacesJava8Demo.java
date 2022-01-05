package com.nt.java8features;

//from java 1.8 we can define the methods in interfaces using default keyword

@FunctionalInterface
interface smartphones
{
	void processor(); //abstract method
	default void imeirange()  //default method
	{
		System.out.println("Sar is below 1");
	}
}


public class DefaultMethodsInInterfacesJava8Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		smartphones oneplus=new smartphones() {
			
			public void processor()
			{
				System.out.println("Snapdragon 860g");
			}
		};
		
		oneplus.processor();
		oneplus.imeirange();
		
		smartphones iphone=()->System.out.println("A12 bionic");	
		
		iphone.imeirange();
		iphone.processor();

	}

}

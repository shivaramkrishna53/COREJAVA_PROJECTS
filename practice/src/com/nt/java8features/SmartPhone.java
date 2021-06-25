package com.nt.java8features;

public  class SmartPhone  extends abc implements phone,phone2 {

	
	
	@Override
	public void call() {
		// TODO Auto-generated method stub
		System.out.println("Smart phone can make calls");

	}

	@Override
	public void msg() {
		// TODO Auto-generated method stub
		System.out.println("Smart phone can make msgs");


	}
//	public void internet()
//	{
//		System.out.println("smartPhone can also be used to surf internet");
//	}

	public static void main(String[] args)
	{
		SmartPhone sp=new SmartPhone();
		sp.call();
		sp.msg();
		sp.internet();
	}

}

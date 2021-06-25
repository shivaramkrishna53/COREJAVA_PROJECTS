package com.nt.java8features;

public interface phone {
	public void call();
	public void msg();
	static  void internet()
	{
		System.out.println("Phone can also be used to surf internet");
	}
	public static void main(String args[])
	{
		phone.internet();
		
	}

}

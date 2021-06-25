package com.nt.java8features;

public interface phone2 {
	public void call();
	public void msg();
	default void internet()
	{
		System.out.println("Phone2 can also be used to surf internet");
	}

}

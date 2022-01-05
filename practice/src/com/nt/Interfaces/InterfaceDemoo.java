package com.nt.Interfaces;

interface Abc
{
 void m1();	
}

class AbcImpl implements Abc
{

	@Override
	public void m1() {
		System.out.println("Logic implemented");
	}
	
}
public interface InterfaceDemoo {

	public static void main(String[] args)
	{
		Abc obj=new AbcImpl();
		obj.m1();
	}
}

package com.nt.hashcodemethodsoverriding;

public class Person {

	int id;
	String name;
	public Person(int id, String name)
	{
		this.id=id;
		this.name=name;
	}
	
	@Override
	public  String toString()
	{
		return this.id+"  "+this.name;
	}
	
//	@Override
//	public int hashCode()
//	{
//		return this.id + this.name.hashCode();
//	}
//	
//	@Override
//	public boolean equals(Object o)
//	{
//		Person p=(Person)o;
//		if(this.id==p.id && this.name.equals(p.name))
//		return true;
//		else
//			return false;
//	}
	
	
	
	
	
	
}

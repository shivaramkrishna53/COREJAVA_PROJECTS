package com.nt.clone;

public class Employee implements Cloneable {
	
	public int empid;
	public String empname;
	
	public Employee(int id,String name)
	{
		empid=id;
		empname=name;
	}
	
	public static void main(String args[]) throws CloneNotSupportedException
	{
		Employee e1=new Employee(101, "shiva");
		Employee e2=(Employee)e1.clone();
		System.out.println(e1.empid);
		System.out.println(e2.empid);
		
		
		
	}

}
//class maincl
//{
//	public static void main(String args[])
//	{
//		
//	}
//}

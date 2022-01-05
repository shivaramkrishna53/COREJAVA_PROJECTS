package com.nt.superkeyword;


class person
{
	int id;
	String name;
	String addrs;
	String fname;
	
	public person()
	{
		System.out.println("person 0param constructor");
	}
	
	public void eat()
	{
		System.out.println("you are in home, no need to eat professionlly");
	}
	
	public person(int id,String name,String addrs)
	{
		this.id=id;
		this.name=name;
		this.addrs=addrs;
	}
	
	
	
}

class Employee extends person
{
	
	int sal;
	String dept;
	public Employee(int id,String name,String addrs,int sal,String dept,String fname)
	{
		super(id,name,addrs);
		super.fname=fname;
		this.sal=sal;
		this.dept=dept;
	}
	
	public Employee()
	{
		System.out.println("Employee 0-param constructor");
	}
	
	public void eat()
	{
		System.out.println("You are in office eat professsionally");
	}
	
	public void workingplace(String loc)
	{
		if(loc.equals("office"))
			this.eat();
		else
			super.eat();
		
	}
	@Override
	public String toString()
	{
		return "id"+ super.id+"name"+super.name+"sal"+this.sal;
	}
	
}

public class superkeywordDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Employee emp=new Employee();
		Employee emp=new Employee(101, "shiva", "hyd", 50000, "software","narsing rao");
		System.out.println(emp);
		emp.workingplace("office");
		
		
	}

}

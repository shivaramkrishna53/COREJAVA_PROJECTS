package com.nt.statickeyword;

class Employee
{
	int id;
	String name;
  static String ceoname;
  static
  {
	  ceoname="naveen";
	  System.out.println("Static block");
  }
  
  public Employee()
  {
	  id=1;
	  name="java";
	 System.out.println("Constructor");
  }
  
	public void show()
	{
		System.out.println(id+"  "+name+"  "+ceoname);
	}
}

public class StaticRealTimeExample {
	
	public static void main(String[] args) {
		Employee ramesh=new Employee();
//		ramesh.id=101;
//		ramesh.name="ramesh";
//		ramesh.ceoname="rajeshgopinath";
//		
		
		Employee suresh=new Employee();
//		suresh.id=102;
//		suresh.name="suresh";
//		suresh.ceoname="shiva";
		Employee.ceoname="reddy";
		ramesh.show();
		suresh.show();
		
	}

}

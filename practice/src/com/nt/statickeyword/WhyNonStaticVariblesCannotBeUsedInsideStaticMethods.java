package com.nt.statickeyword;

class A
{
	public static int num1;
	public int num2=10;
	
	public void fun1()
	{
		num1++;
		num2++;
		System.out.println(num1+"  "+num2);
	}
	public static void fun2()
	{
		num1++;
		System.out.println(num1);
//		num2++;  //when we say num2++ it gives error as num2 is specific to each instance and when we call it dosent know which object of A class num2 value should increment
		
	}
}

public class WhyNonStaticVariblesCannotBeUsedInsideStaticMethods {

	//static variables are accessible in both static methods and non stattic methods because
	//static variables are have common value that are accesible accross all the instances
	//The non static variable cannot be used inside the static method because, non static varibles are specific to a particular instance
	//Example for static variable: Bank Name can be taken as static varible because it is common for all the customers(instances)
	//Example for non static variable:CustomerBankAccountNumber which is specific for every customer(instance)
	
	public static void main(String[] args) {
		
//		System.out.println(A.num1);
//		A obj1=new A();
//		obj1.num2=20;
//		obj1.num1++;
//		
//		
//		System.out.println(obj1.num2);
//		System.out.println(obj1.num1);
//		
//		A obj2=new A();
//		obj2.num2=100;
//		obj2.num2++;
//		obj2.num1++;
//		obj2.num1=500;
//		System.out.println(obj2.num2);
//		System.out.println(obj2.num1);
//		System.out.println(obj1.num1);
//		
		//the above example shows that the static variables hold the common value accross all instances.
		
		//Example 2: The below example shows why non static varible cannot be accesed static method
		
		A obj3=new A();
		obj3.num2=100;
		obj3.fun1();
		A.fun2();
		A obj4=new A();
		obj4.fun1();
		obj4.fun2();
	}
	
}

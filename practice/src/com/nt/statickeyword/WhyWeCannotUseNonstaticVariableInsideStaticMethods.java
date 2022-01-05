package com.nt.statickeyword;

class B
{
	public static int num1;
	public int num2;
	
	public void increment()
	{
		num1++;
		num2++;
	}
	
	public static void increment2()
	{
		num1++;
		
	}
	
	
	
	
}

public class WhyWeCannotUseNonstaticVariableInsideStaticMethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		B obj1=new B();
		B obj2=new B();
		B obj3=new B();
		B.num1=10;
		obj3.num1=20;
		System.out.println(obj1.num1);
		System.out.println(obj2.num1);
		obj3.increment();
		System.out.println(obj2.num1);
		
		
		obj1.num2=10;
		obj2.num2=20;
		obj3.num2=30;
		
//		obj3.increment();
		System.out.println(obj1.num2);
		System.out.println(obj2.num2);
		System.out.println(obj3.num2);
		
	     B.increment2();
	     
	     B obj5=new B();
	     B obj6=obj5;
	     System.out.println(obj5.equals(obj6));
//
//		B.increment2();
//		System.out.println(obj2.num1);
			
			StringBuilder sb=new StringBuilder("Hello");
			sb.append(" World"); //Hello World
			sb.insert(6,"Welcome ");//Hello Welcome World
			sb.replace(8, 13, "go");
			sb.delete(5, 10);
			sb.reverse();
			System.out.println(sb.charAt(4));
			System.out.println(sb);
	}

}

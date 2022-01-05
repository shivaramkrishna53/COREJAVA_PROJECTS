package com.nt.DynamicMethodDispatch;

class A
{
  int i;
	public void show() {System.out.println("a show");}
	
}
class B extends A
{
	int i;
	public void show() {System.out.println("b show");}
	public void find() {System.out.println("b find");}
}

class C extends A
{
	public void show() {System.out.println("inside c show");}
}


public class Demo {

	public static void main(String[] args) {
	
		A obj=new C();
		obj.show();
		obj=new B();
		obj.show();
		
		
	}

}

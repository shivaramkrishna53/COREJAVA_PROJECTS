package com.nt.doesstaticmethodsovveriide;

public class MainClss {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Parent cl=new Child();
		cl.display();

	}
	
	//static methods are common for all the objects and sub classes if u want to update the method it needs to be updated in the parent class static method itself... even we overriide the static method in subclasss no use as static methods are common methods to all.

}

package com.nt.hashcodemethodsoverriding;

import java.util.HashMap;
import java.util.Map;

public class MainCls {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person p1=new Person(101, "jack");
		Person p2=new Person(102, "jill");
		Person p3=new Person(101, "jack");
		
		//when we directly print the object instance then it calls the toString() method of the Obect class.
		
		//if the Obectclass toString() method is not overriden in the current class then it prints the package.class.Hashcode
		//if we ovveride the toString() then the ovvveridden toString() methodo is called
		System.out.println(p1);
		System.out.println(p2);
		
		//hashcode() is used to provide the memory address of the object with out checkiing the conetent of the oobject
		//if we dont ovveride the hashcode() method jvm blindly gives the memeory identification number withoout checking the content
		
		
		
		//if we want to generate hashcode based on the content then we can ovverride the hashcode method
		
		
		// in the object class equals method it compares the identityhashcode of two obects and returns true or false
		System.out.println(p1.equals(p2) + " "+System.identityHashCode(p1) + " "+System.identityHashCode(p2));
		System.out.println(p1.equals(p3)+ " "+System.identityHashCode(p1)+ " "+System.identityHashCode(p3));
		
		System.out.println(p1.hashCode());
		System.out.println(p2.hashCode());
		System.out.println(p3.hashCode());
		
		// if we want to get the result in equals method based on our logic(based on content) then we can ovveride the equals method
		Map<Person,Integer> mp=new HashMap<Person, Integer>();
		mp.put(p1,101);
		

	}

}

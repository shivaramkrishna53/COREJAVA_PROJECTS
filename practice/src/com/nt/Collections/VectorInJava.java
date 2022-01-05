package com.nt.Collections;

import java.util.Vector;

public class VectorInJava {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//vectors are used to store the data dynamically, similar to arraylist and having synchronized behaviour
		//vectors also preserve insertion order
		Vector v=new Vector();
		v.add("shiva");
		v.add(23);
		v.add(5.10);
		System.out.println(v);
		v.remove(2);
		System.out.println(v);
		v.add(2, "Accenture");
		System.out.println(v);
		v.add(2,"oracle");
		System.out.println(v);
		v.set(2,"Infosys");
		System.out.println(v);

	}

}

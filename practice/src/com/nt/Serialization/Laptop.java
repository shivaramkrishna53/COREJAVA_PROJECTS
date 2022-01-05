package com.nt.Serialization;

import java.io.Serializable;

public class Laptop implements Serializable {

	// serializable interface is a marker interface which means there are no class members and methods associateed with that interface
	
	int laptopid;
	String laptopname;
	
	public Laptop(int lid,String lname)
	{
		laptopid=lid;
		laptopname=lname;
	}
}

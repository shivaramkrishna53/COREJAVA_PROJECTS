package com.nt.HashingEqualsHashCodeDemo;

import java.util.HashMap;
import java.util.Map;

/*

Hashing is the process of generating integer value for a object based on the hashing algorithm so that the generated integer value can be used further in order to access the object in a faster way.
Rules to be followed:
1.if two objects are equal..i.e if obj1.equals(obj2) returns true... Then there hashcode should also be same
2.if two objects are not equal. i.e if obj1.equals(obj2) return false.. Then there hashcode need not be same.
 */

class emply
{
	int eid;
	String ename;
	public emply(int no,String name)
	{
		eid=no;
		ename=name;
	}
	
	@Override
	 public boolean equals(Object obj) 
	{
		emply e=(emply)obj;
		if(this==obj)
			return true;
		if(this.eid==e.eid && this.ename.equals(e.ename))
			return true;
		else
			return false;
	}
	
	@Override
	public int hashCode()
	{
		return this.eid;
	}
	
	@Override
	public String toString()
	{
		
		return "eid::"+eid+"  ename::"+ename;
	}
}


public class HashingEqualsHashCodeDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String x="abc";
		String y="abc";
		
		if(x.equals(y))
		{
			System.out.println("Hash code of x::"+x.hashCode());
			System.out.println("Hash code of y::"+y.hashCode());
		}
		
		emply e1=new emply(101, "shiva");
		emply e2=new emply(101, "shiva");
		emply e3=new emply(104,"jhoonny");
		
		
		
		
		Map<emply,String> mp=new HashMap<emply, String>();
		mp.put(e1, "tester");
		mp.put(e2,"Java Developer");
		
		System.out.println(mp.get(e1));
		System.out.println(mp.get(e2));
		
		
		System.out.println("e1 hashcode::"+e1.hashCode());
		System.out.println("e2 hashcode::"+e2.hashCode());
		System.out.println("e3 hashcode::"+e3.hashCode());
		System.out.println(e1.equals(e2)); //though the content of both e1 and e2 are same it is producing false,and even hashcodes are different for e1 and e2..So inorder to have both e1 and e2 pointing to same index in hashtable we need to ovverride both equals() and hashcode() methods
		System.out.println(e2.equals(e3));
		System.out.println(e3.equals(e1));
		
		
		
		
		

	}

}

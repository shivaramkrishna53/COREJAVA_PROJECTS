package com.nt.StringHandling;

public class WhyStringISImmutable {
//the below program shows that strings are immutable(not changable),i.e the content of the object doesn't change once assigned...only the reference changes to other string object.
//immutable means we cannot change/modify the content of the String object once it is created in the memory...If we change the content then new String Object gets created holding the new value in the memory.
	
	public static void main(String[] args) {
		
		String s1="shiva";
		String s2="shiva";
		String s3=s1;
		s1=s1+"ram";
		System.out.println(s1.hashCode());
		System.out.println(s2.hashCode());
		System.out.println(s3.hashCode());
		String s4=new String("shiva");
		s4.concat("ram");
		System.out.println(s4);
		System.out.println(s4.hashCode());
	}
	
	

}

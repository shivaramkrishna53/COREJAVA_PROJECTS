package com.nt.StringHandling;

public class HowToMakeStringMutable {
	//we can make string as mutable using Two classes they are String Buffer and String Builder
	//mutable means that the content of the string object in memory can be modified without creating the new string object in memory.
	//The only difference b/w stringbuffer and stringbuilder is, stringbuffer is threadSafe as it supports synchronization...whereas stringbuilder is not threadsafe
	public static void main(String[] args) {
		
		String s1="shiva";
		StringBuffer sb=new StringBuffer("shiv");
		System.out.println(sb);
		System.out.println(sb.hashCode());
		sb.replace(0,3,"ss");
		sb.append('z');
		sb.insert(1, "wq");
		sb.append("w3schools");
		sb.delete(0,3);
		sb.reverse();
		System.out.println(sb.capacity());
		System.out.println(sb);
		System.out.println(sb.hashCode());
	}

}

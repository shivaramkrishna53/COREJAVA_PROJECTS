package com.nt.StringHandling;

import java.util.ArrayList;
import java.util.List;

public class StringClassRevision {

	public static void main(String[] args) {

     String s1="java";
     String s2="java";
     String s3=new String("java");
     //System.out.println(s1.hashCode());
     
     //System.out.println(s2.hashCode());
     System.out.println(s1==s2);
     System.out.println(System.identityHashCode(s1));
     System.out.println(System.identityHashCode(s2));
     
     System.out.println(s1.equals(s2));
     
     System.out.println(s3==s1);
     System.out.println(System.identityHashCode(s3));
     
     
     String sam="java is a language";
     
     //1.charAt() is used to get the character present at the particular index
     
     char ch=sam.charAt(2);
     System.out.println(ch);
     
     // 2.compareTo() is used to compare two Strings lexicogafically
     
     String s4="abcd";
     String s5="abce";
   
     int c=s4.compareTo(s5);
     System.out.println(c);
     
     String s6="abcD";
     String s7="abce";
     
     System.out.println(s6.compareToIgnoreCase(s7));
     
     System.out.println(s6.concat(s7));
     
     String t1="java is a backendlanguage";
     String t2="lang";
     System.out.println(t1.contains(t2));
     
     String s8="abcD";
     String s9="abcd";
     System.out.println(s8.equalsIgnoreCase(s9));
     System.out.println(s9.equals(s8));
     
    String tst=String.format("today is %f tempereature ", 23.3);
    String tst2=String.format("the probability is %87.5f", 87.243);
    System.out.println(tst2);
    System.out.println(tst);
    
    System.out.println(tst.hashCode());
    
    System.out.println(t1.indexOf("back"));
    
    System.out.println(t1.substring(4));
    
    System.out.println(t1.substring(0, 4));
    
    System.out.println(t1.contains("java"));
    
    System.out.println(t1);
    
    ArrayList<String> al=new ArrayList<String>();
    al.add("wakeup");
    al.add("eat");
    al.add("work");
    al.add("enjoy");
    al.add("sleep");
   
    //join is used to join the set of strings with the specified one
  String x=String.join("::::", al);
  System.out.println(x);
  
  System.out.println(x.isEmpty());
  
  String uv=x.replace("::::", ">>");
  System.out.println(uv);
  
  String[] arx=uv.split(">>");
  
  for(String w:arx)
  System.out.println(w);
  
  System.out.println(t1);
  System.out.println(t1.indexOf("end"));
  
  System.out.println(t1.toUpperCase());
  
  String st="  abc  def  efg   ";
  System.out.println(st.trim());
  
  int a=10;
  System.out.println(String.valueOf(a)+"hellow");
  
  System.out.println(t1);
  char[] charr=t1.toCharArray();
  for(char cs:charr)
	  System.out.println(cs);
  
  
	}

}

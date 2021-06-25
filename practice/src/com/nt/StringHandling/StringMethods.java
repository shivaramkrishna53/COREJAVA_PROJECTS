package com.nt.StringHandling;

public class StringMethods {

	public static void main(String[] args) {
		// declare a string using char array
		
		char[] charr=new char[] {'j','a','v','a'};
		String s1=new String(charr);
		String s2="java";
		String s3=new String("java");
		String s4=s3;
		s3=s3+"jee";
		System.out.println(charr.hashCode());
		System.out.println(s1.hashCode());
		System.out.println(s2.hashCode());
		System.out.println(s3.hashCode());
		System.out.println(s4.hashCode());
		
		String str="hellow world how is ur hellow world";
		//1.split(" ")-->split function is used to split the sentance to multiple words whereever " " has occured
		String[] words=str.split(" ");
		for(String word:words)
			System.out.println(word);
		
		//2.trim()-->it is used to trim the white spaces at starting and ending of the string
		String st="    hellow is world abc    ";
		System.out.println(st);
//		st=st.trim();
//		String[] w=st.split(" ");
//		System.out.println(w.length);
		st=st.trim();
		System.out.println(st);
		
		//3.charAt(index) is used to get the char at a particular index
		String name="shiva";
		char ch=name.charAt(2);
		System.out.println(ch);
		
		//4.replace() is used to repalace the given character with other one
		
		String wrd="arya is a good boy in good place";
		String brd1=wrd.replace('a', 'b');
		String brd2=wrd.replace("good", "bad");
		System.out.println(brd1);
		System.out.println(brd2);
		
		//5.tocharArray() is used to convert the given string to chararrray
		String a="hellow";
		char[] acharr=a.toCharArray();
		
		//6.contains() is used to check wheather the given character contains in the string or not
		String q="hellow everyone welcome to the party";
		boolean flag=q.contains("tooo");
		System.out.println(flag);
		
		//7.length() is used to give the length of the string
		String stw="shiva";
		System.out.println(stw.length());
		
		//8.concat() or + is used to concat/combine one string with other
		
		String w1="hellow";
		String w2="world";
		w1.concat(w2);
		System.out.println(w1); //though we use concat it is not appending w2 to w1 becaz as strings are immutable
		w1=w1.concat(w2);
		System.out.println(w1); //now it is concating as we are collecting the reference of the hellowworld string that is created in string pool
		//or instead of concat() we can use w1=w1+w2
		
		//9. substring() is used to create a substring from the given string
		
		String wd="hellow";
		String subwd1=wd.substring(1,5);
		String subwd2=wd.substring(1);
		System.out.println(subwd1);
		System.out.println(subwd2);
		
		//10.case conversion: toUpperCase(), toLowerCase()
		
		String nam="shiva";
		String upr_name=nam.toUpperCase();
		System.out.println(upr_name);
		String lwr_name=upr_name.toLowerCase();
		System.out.println(lwr_name);
		
		//11.equals() ,equalsIgnore()
		
		String q1="shiva";
		String q2="shiva";
		System.out.println(q1.equals(q2));
		String q3="shIvA";
		String q4="ShiVa";
		System.out.println(q3.equalsIgnoreCase(q4));
		
		// 12.  == the only difference b/w equals and == is that equals is used to check wheather the content are equal or not....whereas == is used to check the references. if both obects refering to same reference then returns true else false
//		String s1 = new String("Shubham");
//		String s2 = new String("Shubham");
//
//		In these two above lines, we create two instances of String objects. They exist separately, so they occupy different parts of the memory, so have different reference.
//		But they contain the same value, therefore their hashCode is the same.
//		hashCode is an integer number that is intended to signify the uniqueness of your objects. If two objects are equal, they must also have the same hashcode. 
		
		String sg1="table";
		String sg2="table";
		String sg3=new String("table");
	   System.out.println("hiii"); 
	   System.out.println(sg1==sg2);
	   System.out.println(sg1==sg3);
	   System.out.println(sg1.hashCode()); //refer the lines 97-102 to get diff b/w reference and hashcode
	   System.out.println(sg3.hashCode());
		
	   //13. compareto() returns 0 if both strings are same, returns -ve if the invoking string is less than the passed string, returns +ve if the invoking string is greater than passed string
	   String c1="apple";
	   String c2="apple";
	   String c3="ball";
	   System.out.println(c1.compareTo(c2));
	   System.out.println(c2.compareTo(c3));
	   System.out.println(c3.compareTo(c2));
	   
	   //14. startsWith() and endsWith()
	   String tech="java is very powerful";
	   System.out.println(tech.startsWith("ja"));
	   System.out.println(tech.endsWith("rdfful"));
	   
	}
}

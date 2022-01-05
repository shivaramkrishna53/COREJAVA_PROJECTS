package com.nt.Collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class stud implements Comparable<stud>
{
	int rollno;
	String name;
	int marks;
	
	public stud(int no,String nam,int mar)
	{
		rollno=no;
		name=nam;
		marks=mar;
	}
	public String toString()
	{
		return "rollno::"+rollno+"  name::"+name+" marks::"+marks;
	}
	@Override
	public int compareTo(stud o) {
		// TODO Auto-generated method stub
		return this.marks>o.marks?1:-1;
	}
}




public class ComparableInterfaceDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		stud s1=new stud(101,"shiva",20);
		stud s2=new stud(102,"sai",90);
		stud s3=new stud(103,"roopesh",40);
		stud s4=new stud(104,"varu",100);
		
		List<stud> lststud=new ArrayList();
		lststud.add(s1);
		lststud.add(s2);
		lststud.add(s3);
		lststud.add(s4);
		
		Collections.sort(lststud);
		//Collections.sort(lststud,(i,j)->i.marks>j.marks?1:-1);
		
		for(stud s:lststud)
		{
			System.out.println(s);
		}

	}

}

package com.nt.Collections;
/*
collection:It is a concept
Collection:It is a Interface
Collections:It is a class

Collection api has lot of classes, interfaces

What is the need for collections?
Generally if we use Array, there is only fixed size... So there is a limitation for
Dynamically increase or decrease the size of the array.
eg: int[] arr=new int[5];
Here in the above array we can add only 5 elements, and we cannot add more elements and we cannot directly delete the elements in middle of array.
once defined. i.e we cannot expand or shrik  the size of array dynamically.

So using collections we can dynamically increase or decrease the size. 
 */

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

public class CollectionConceptDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Collection(I)-->List(I)-->ArrayList(C)
		
		Collection values=new ArrayList();  //The issue with Collection(I) is that it does not store the values in index based format, so use List
		values.add(10);
		values.add("shiva");
		values.add(20.5);
	
		
			//System.out.println(values.get(2)); //when u uncomment the line it throws error as Collection does not store the values in index based, and the get method gives error
	
		//so as the above line giving error as collections don't maintain indexes
		// So we can use a Iterator interface in order iterate through all the elements of the Collection
		
		Iterator it=values.iterator();
		
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
		
		List vals=new ArrayList();
		vals.add("shiva");
		vals.add(10.5);
		vals.add(20);
		
		System.out.println(vals.get(2));
		
		//if u want to store only one specific type of data then we can use generic
		//eg:
		
		List<Integer> rollnos=new ArrayList();
		rollnos.add(49);
		rollnos.add(53);
		rollnos.add(53);
		
		//List can store duplicate values into it. And List also maintains insertion order
		System.out.println(rollnos.get(1));
		System.out.println(rollnos.get(2));
		System.out.println(rollnos);
		//If the requirement is to store only unique values then use Set
		
		//eg:
		Set names=new HashSet();
		names.add("jhonny");
		names.add("shiva");
		names.add("Emmi");
		names.add("shiva");
		names.add("jhonny");
		names.add("jhonny");
		System.out.println(names);
	
		//map is used to store the values in key,value pairs
		
		Map<String,Integer> emps=new HashMap();
		emps.put("shiva", 101);
		emps.put("ram",102);
		System.out.println(emps);
		
		
		
		
		

	}

}

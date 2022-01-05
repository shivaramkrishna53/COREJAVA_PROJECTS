package com.nt.Collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;
/*
 
 List is a interface in collection api.
 List allows duplicate elements
 In list insertion order is maintained
 List has mainly 3 subclasses:
 1.ArrayList
 2.LinkedList
 3.Vector
 
 Difference b/w ArrayList and LinkedList
 
 ArrayList                                      LinkedList
1.ArrayList uses Dynamic array          1.LinkedList uses Doubly linked list
2.Modification of the list takes        2.Modifications done to Linked list dose'nt 
more time to process as the elements    take much time to process as the links are only interchanged
need to shift.                          for one or two elements.
3.It is much preferred in case of       3.Preffered Only when there is a need for modifying the
storing and retriving elements as         elements in the list.
arrays are faster for storing and 
retriving the elements.And not prefferred
in case of modifications.


Difference b/w ArrayList and vector

ArrayList                                              Vector
1.Introduced in java 1.2                       1.It is a Legacy java class
2.It is Non-Synchronized                       2.It is synchronized
3.As it is non-synchronized it                 3.As it is synchronized it is thread safety
is non-thread safety.
4.Performance is fast.                         4.performance is slow.
5.The arrayList increases its size             5.The vector increases its size by
by 50% when it reaches its limit               100%, i.e it doubles its size when the size has reached
 */

public class ListDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List vals=new ArrayList();
		vals.add(10);
		vals.add("shiva");
		vals.add(20.3);
		vals.add(2, "accenture");
		System.out.println(vals);
		
		/*
		 * for(Object o:vals) { System.out.println(o); }
		 */
		
		//Generics are used in order to maintain typesaftety i.e to maintain single type to stroe
		List<Integer> val2=new ArrayList<Integer>();
		val2.add(1);val2.add(2);
		List<Integer> val=new ArrayList();
		
		val.add(20);
		val.add(10);
		val.add(40);
		val.add(90);
		val.add(1, 5);
		val.add(4, 90);
		val.addAll(val2);
	
			System.out.println(val);
			val.remove(4);
			System.out.println(val);
			System.out.println(val.size());
			System.out.println(val.contains(10));
			val.clear();
		System.out.println(val.isEmpty());
		System.out.println(val);
		val.add(1);val.add(2);
		System.out.println(val.equals(val2));
		Iterator it=val.iterator();
		while(it.hasNext())
			System.out.println(it.next());
		System.out.println(it.hashCode());
		
		
		val.set(1, 3);
		//val.get(2);
		val.addAll(1,val2);
		
		Iterator<Integer> its=val.iterator();
		
		System.out.println(val);
		
		val.remove(new Integer(1));
		val.remove(new Integer(3));
		
		System.out.println(val);
		List<Integer> l1=new LinkedList<Integer>();
	    List<Integer> l2=new Vector<Integer>();
	    
	    List<Integer> nos=new LinkedList<Integer>();
	    nos.add(20);
	    nos.add(10);
	    nos.add(9);
	    System.out.println(nos);
 
		
		
	}

}

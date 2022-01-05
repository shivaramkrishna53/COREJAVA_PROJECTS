package com.nt.Collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

//Collections is a class which has static methods which can be used.such as Collections.sort() Collections.max() Collections.min() Collections.reverse()

public class CollectionsClassDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Integer> lst=new ArrayList();
		lst.add(9);
		lst.add(2);
		lst.add(5);
		lst.add(1);
		System.out.println(lst);
		//sort() to sort the elements
		Collections.sort(lst);
		System.out.println(lst);
		//to search any element in the lst
		System.out.println(Collections.binarySearch(lst,5));
		//to reverse all the elements
		Collections.reverse(lst);
		System.out.println(lst);
		
		

	}

}

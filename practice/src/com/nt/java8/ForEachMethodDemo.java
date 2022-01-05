package com.nt.java8;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
/*
 Different approches to iterate to the collections:
 1.normal for loop
 2.enchanced for loop
 3.ForEachLoop: The normal for loop and enchanced for loop are external loops,i.e they are outsiide of collection api.
 ForEachLoop is inside the Collection api, and it is faster than the above 2.
 */

public class ForEachMethodDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Integer[] arr= {1,3,5,1,6,54,3};
		List<Integer> lst=Arrays.asList(arr);
		
//		for(int i=0;i<lst.size();i++)   //normal for loop
//		{
//		System.out.println(lst.get(i));	
//		}
		
//		for(int i:lst)      //enchanced for loop
//		{
//			System.out.println(i);
//		}
		
		//foreachloop is inside the collection api and used to iterate through all the elements of the collection
		
		lst.forEach(i->System.out.println(i));
		

		
	}

}

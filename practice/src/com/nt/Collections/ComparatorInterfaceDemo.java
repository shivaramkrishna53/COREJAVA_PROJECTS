package com.nt.Collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
//comparator is an functional interface, which contains a compare() method,by overriding that method we can provide our own comparing logic
public class ComparatorInterfaceDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Integer> lst=new ArrayList<Integer>();
		lst.add(233);
		lst.add(981);
		lst.add(497);
		lst.add(550);
		lst.add(839);
		lst.add(925);
		
		//by oveerriding compare() in comparator interface, we can implement our own logic for sorting of elements
//		Comparator<Integer> c=new Comparator<Integer>() {
//
//			@Override
//			public int compare(Integer o1, Integer o2) {
//				if(o1%10>o2%10)
//					return 1;
//				else
//					return -1;
//			}
//		};
		
		Comparator<Integer> c=(o1,o2)->(o1%10>o2%10)?1:-1;
				
		Collections.sort(lst, c);
		System.out.println(lst);
		

	}

}

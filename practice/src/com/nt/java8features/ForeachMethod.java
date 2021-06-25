package com.nt.java8features;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ForeachMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Integer> ls=Arrays.asList(1,2,3,4);
		int a[]=new int[] {2,3,2};
		for(int i=0;i<ls.size();i++)
		{
			System.out.println(ls.get(i));
		}
		
		//ENHANCED FOR LOOP
//		for(int i:ls)
//		{
//			System.out.println(i);
//		}
////		
//		//For each method
//		ls.forEach(i->System.out.println(i));
//		
		for(int k=0;k<ls.size();k++)
		{
			System.out.println(ls.get(k));
		}
		ArrayList<Integer> al=new ArrayList();
		al.add(1);
		
		for(int x:al)
		{
			System.out.println(x);
		}
		al.forEach(i->System.out.println(i));
	}

}

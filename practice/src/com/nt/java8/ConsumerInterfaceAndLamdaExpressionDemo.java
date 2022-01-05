package com.nt.java8;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

//class consumerimpl implements Consumer<Integer>
//{
//
//	@Override
//	public void accept(Integer t) {
//		System.out.println(t);
//		
//	}
//	
//}

public class ConsumerInterfaceAndLamdaExpressionDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//foreach loop is present in collection api which is used to itterate a collection/List
		
		
		Integer[] arr=new Integer[] {1,4,1,5,6};
		List<Integer> lst=Arrays.asList(arr);
		
//		Consumer<Integer> c=new Consumer<Integer>() {   //ananomyous inner class
//
//			@Override
//			public void accept(Integer t) {
//				// TODO Auto-generated method stub
//				System.out.println(t);
//				
//			}
//			
//		};
		
		
		Consumer<Integer> c=t->System.out.println(t);
		
		lst.forEach(c);
		
	}

}

package com.nt.java8features;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

//Consumer<T>

//class ConsImpl implements Consumer<Integer>
//{
//
//	@Override
//	public void accept(Integer t) {
//		// TODO Auto-generated method stub
//		System.out.println(t);
//		
//	}
//	
//}


public class ConsumerInterfaceDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> l=Arrays.asList(1,2,3);
		//foreach method of java8
		//l.forEach((i)->System.out.println(i));
//		Consumer<Integer> c=new Consumer<Integer>() {  //ananonmoys inner class
//
//			@Override
//			public void accept(Integer t) {
//				// TODO Auto-generated method stub
//				System.out.println(t);
//				
//			}   
//			
//		};
		
		
		//lamda expression(must be an functional interface(interface with one abstract mehtod))
		
	//	Consumer<Integer> c=(Integer t)->System.out.println(t);
		
		
		
		l.forEach((Integer t)->System.out.println(t));

	}

}

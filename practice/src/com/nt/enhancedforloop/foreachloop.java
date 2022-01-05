package com.nt.enhancedforloop;

public class foreachloop {

	public static void main(String[] args) {
		
		int[] arr= {1,2,4,5,3,5};
		
		//for each loop is also called as enhanced forloop
		
//		for(int k:arr)
//			System.out.println(k);
//		
		int[][] arr2= {{1,2,3},{4,5,6},{7,8,9}};
		
		for(int[] ar:arr2)
		{
			for(int w:ar)
				System.out.println(w);
		}
		
		
	}
	
	
}

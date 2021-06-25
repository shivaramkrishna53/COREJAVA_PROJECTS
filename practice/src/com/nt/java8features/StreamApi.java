package com.nt.java8features;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamApi {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> ls=new ArrayList<Integer>();
		ls=Arrays.asList(102,11,261,2,32,4,5,63,7);
		//collections are used to store elements of same type..whereas streams are used to process the elements.
		
		//1.Filter in stream api-->used to filter the elements based on certain condition
		List<Integer> ls2=ls.stream().filter((i)->i%2==0).collect(Collectors.toList());
		System.out.println(ls2);
		
		//2.Map-->if we want to add certain values to the already present Elements then we need to go for Map
		List<Integer> plus5tols=ls.stream().filter(i->i<35).map(i->i+5).collect(Collectors.toList());
		System.out.println(plus5tols);
		System.out.println(ls.stream().filter(i->i>100).collect(Collectors.toList()));
		
		//3.count-->method is used to count the no. of elements/objects are there in the stream.
		System.out.println(ls.stream().filter(i->i%2==1).count());
		
		//4.sorted-->is used to sort the elements of the stream
		List<Integer> sortedList=ls.stream().sorted().collect(Collectors.toList());
		System.out.println(sortedList);
		
		
		Comparator<Integer> com= (i1,i2)->{
//			if(i1>i2)
//				return -1;
//			else
//				return 1;
//			 return i1.compareTo(i2);
			return i2.compareTo(i1);
		};
      List<Integer> sortedlst=ls.stream().sorted(com).collect(Collectors.toList());
      System.out.println(sortedlst);
      
      List<String> stlst=new ArrayList<String>();
      stlst=Arrays.asList("ba","e","cadfsdfdsf","fafsdfsf","daasfdsdf");
      
      Comparator<String> co=(s1,s2)->{
    	 int l1=s1.length();
    	 int l2=s2.length();
    	 if(l1>l2)
    		 return 1;
    	 else
    		 return -1;
      };
     
    List<String> srtlst=stlst.stream().sorted(co).collect(Collectors.toList());
    System.out.println(srtlst);
    
  //5. min(),max() to find the min and max element in the stream
	
  	List<Integer> al= Arrays.asList(20,1,30,5,0,8,9,27);
  	Integer min=al.stream().min((i1,i2)-> i1.compareTo(i2)).get();
  	System.out.println(min);
  	int max=al.stream().max((a,b)->a.compareTo(b)).get();
  	System.out.println(max);
  	int min1=al.stream().min((a,b)->b.compareTo(a)).get();
  	System.out.println(min1);
	int max1=al.stream().max((a,b)->b.compareTo(a)).get();
  	System.out.println(max1);
  	System.out.println("--------------------------------");
  	//6.forEach() it is used to itterate through all the elements of the stream
  	
  	al.stream().forEach((i)->System.out.println(i));
  	//alternate is
  	al.stream().forEach(System.out::println);
  	
  	//7.toArray() is used to convert the given stream into the array
  	
  Integer[] abc=al.stream().toArray(Integer[]::new);
  	for(int x:abc)
  		System.out.println(x);
  	
  	
  	//Stream.of()  to convert any array to stream 
  	
  	Stream<Integer> s=Stream.of(1,9,10,18);
  	
  	System.out.println(s.count());
  	
	}
	
	
	
	
	

}

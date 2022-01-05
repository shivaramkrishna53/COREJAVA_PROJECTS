package com.nt.Collections;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;
/*
 Map:Map is a interface in Collection api, the purspose of map is to store the data
 in key,value pairs. And we can have unique keys and can have repeated values.
 
 Map has mainly 4 implementation classes:
 1.HashMap-->insertion order  not maintained, it is non-synchronized,introduced in java 1.2, faster performance, Non-thread safe
 2.HashTable-->insertion order not maintained, it is synchronized, slower performance, it is legacy class
 3.LinkedHashMap-->Inserrtion order is maintained
 4.TreeMap-->Elements are sorted in accending order.
 
 
 
 
 */


public class MapInterfaceDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//map is a interface in Collection api which contains data in key,value pair.
		Map<String,String> m=new HashMap(); //hashmap is non-synchronized and hashtable is synchronized
		m.put("name", "shiva");
		m.put("fname", "durgi");
		m.put("actor", "prabhas");
		m.put("movie", "Bahubali");
		
		
		Set s=m.keySet();
		
		for(Object key:s)
		{
			System.out.println(key+"::"+m.get(key));
		}
		
		//we can also retrive the map using the entrySet() method
		
		
		Set<Entry<String, String>> st=m.entrySet();
		
		for(Entry<String,String> en:st) {
		System.out.println("Key::"+en.getKey()+"    Value::"+en.getValue());
		en.setValue("abc");
		}
		
		for(Entry<String,String> en:st)
		{
			System.out.println(en.getKey()+"::::"+en.getValue());
		}
		
		
		Map<String,String> phbk=new Hashtable<String, String>();
		phbk.put("shiva", "7036202095");
		phbk.put("varu","1000");
		phbk.put("ropee", "8686440007");
			System.out.println(phbk);
			
			
	  Map<Long, String> bnkdtls=new LinkedHashMap();//insertion order is maintained
	  bnkdtls.put(101700l, "shiva");
	  bnkdtls.put(101701l, "sai");
	  bnkdtls.put(101703l, "varu");
	  bnkdtls.put(101704l, "shiva");
	  
	  Set<Entry<Long,String>> dtls=bnkdtls.entrySet();
	  
	  for(Entry<Long,String> per:dtls)
		  System.out.println(per.getKey()+":::"+per.getValue());
	  
	  Map<Long, String> bnkdtls2=new TreeMap<Long, String>();//Sorts the elements in accending order
	  bnkdtls2.put(102121L, "shiva");
	  bnkdtls2.put(1011132L, "sai");
	  bnkdtls2.put(101903L, "varu");
	  bnkdtls2.put(101504L, "shiva");
	  
//	  Set<Long> kst=bnkdtls2.keySet();
//	  for(Long k:kst)
//		  System.out.println(bnkdtls.get(k)+":::"+k);
	  System.out.println("-----------------------");
	  Set<Entry<Long,String>> enst=bnkdtls2.entrySet();
	  for(Entry<Long,String> en:enst)
		  System.out.println(en.getKey()+":::"+en.getValue());
	  
	  Map<String, Integer> scores=new HashMap<String, Integer>();
	  scores.put("CLARK", 90);
	  
	  System.out.println("MIKE".hashCode());
		System.out.println("MIKE".hashCode()& 15);
		

	}

}

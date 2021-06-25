package com.nt.StringHandling;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class ProgramTofindTheDuplicateWordsAndTheirOccurance {

	public static void main(String[] args) {
		
		String sen="hellow how hellow how the world happy shiva of the happy shiva of the world";
	    String[] words=sen.split(" ");
	    Map<String,Integer> mp=new HashMap<String, Integer>();
	    for(String word:words)
	    {
	    	if(mp.containsKey(word))
	    	{
	    		mp.put(word, mp.get(word)+1);
	    	}
	    	else
	    		mp.put(word, 1);
	    }
	    
	    Set<String> st=mp.keySet();
	    
	    for(String w:st)
	    {
	    	if(mp.get(w)>1)
	    	{
	    		System.out.println(w+"   :  "+ mp.get(w));
	    	}
	    }
	    
	}
	
	
}

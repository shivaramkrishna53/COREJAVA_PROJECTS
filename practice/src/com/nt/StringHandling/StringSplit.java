package com.nt.StringHandling;

public class StringSplit {
	public static void main(String[] args) {
		

	// the str.split(" ") is used to split the sentance to individaual words whereever the " " is occured
	String sentence="this is the world of humans";
	String[] words=sentence.split(" ");
	for(String word:words)
	{
		System.out.println(word);
	}
	
	}
}

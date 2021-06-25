package com.nt.java8features;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.ZoneId;

public class NewDateTimeApiInJava8 {

	public static void main(String args[]) {
	//Before java 8 there was Date class:
    //The main drawbacks of the Date class is:
	//1.Date d=new Date(); d.now() not only gives Date but also gives time along with date.
	//2.The Date class was not thread safe, is no two threads can accesss at same time the date class object.
	//3.Date class is present in both packages java.util and java.sql packages which makes user confusing.
	
	//Main reasons for New Date Api of Java 8
	//1.simple to use
	//2.it is immutable..i.e it is not changeable and though we try to change it creates a new Date object.
	
//	LocalDate l=LocalDate.now();
//	System.out.println(l);
    LocalDate d=LocalDate.of(2021,3,1);
	System.out.println(d);
	//LocalTime lt=LocalTime.now();
	//lt=LocalTime.of(20, 00);
	LocalTime lt=LocalTime.now(ZoneId.of("GMT"));
	System.out.println(lt);
	
	LocalDateTime dt=LocalDateTime.now(ZoneId.of("Asia/Kolkata"));
	System.out.println(dt);
	//LocalDate lc=LocalDate.now
}
}
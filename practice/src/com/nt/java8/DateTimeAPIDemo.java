package com.nt.java8;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

/*
 Before java 8 we use to have Date class which is present in java.util and java.sql package
 Before java8 the date class was not-thread safe, i.e when multiple threads accessing one date object thus resulting in inconsitency.
 In java8 they have launched date classes such that they are immutable, i.e the state of the object dosent change.. and creates new object if we change its state
 In java8 introduced the following classes in datetime api majorly:
 1.LocalDate
 2.LocalTime
 3.LocalDateTime
 */


public class DateTimeAPIDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		LocalDate dt=LocalDate.now();
		System.out.println(dt);
		dt=LocalDate.of(2019, 03, 20);
		System.out.println(dt);
		
		LocalTime tm=LocalTime.now();
		System.out.println(tm);
		tm=tm.of(23, 10, 2, 132);
		System.out.println(tm);
		
		LocalDateTime l=LocalDateTime.now();
		System.out.println(l);
		l=LocalDateTime.of(1998, 03, 20, 21, 20);
		System.out.println(l);

	}

}

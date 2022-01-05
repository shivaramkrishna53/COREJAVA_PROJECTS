package com.nt.java8;

import java.util.Arrays;
import java.util.List;

/*
 Generally we pass values to a function.... if we pass a functionreference to a function is called as methodreference
 
 MethodReference: MethodReference is nothing but passing a method as value to another method
 */

interface DrivingLicence
{
	String islicenseneeded(int age);
}

class DriveCheck
{
	public  String checkage(int age)
	{
		if(age>=18)
			return "Yes";
		else
			return "NO";
	}
}

class RTO
{
	public void issueLicence(int age,DrivingLicence dl)
	{
		String result=dl.islicenseneeded(age);
		System.out.println(result);
	}
}

public class MethodReferenceDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//eg1: lets take the foreachmethod
		
		List<Integer> lst=Arrays.asList(1,3,2,56,74);     //(Integer t)->{System.out.println(t)}
		lst.forEach(System.out::println);
		
		
		//eg2: for driving license
		DriveCheck dc=new DriveCheck();
		RTO obj=new RTO();
		obj.issueLicence(23,dc::checkage);  //we are passing a functionrefernce as function parameter
		
		

	}

}

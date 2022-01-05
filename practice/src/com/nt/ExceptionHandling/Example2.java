package com.nt.ExceptionHandling;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class Example2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="shiva";
		try
		{
			System.out.println("stmnt1");
			System.out.println(str.charAt(10));
			System.out.println("stmnt2");
		}
		catch(StringIndexOutOfBoundsException ae)
		{
			System.out.println("Array size exceeded");
		}
		
		catch(Exception e)
		{
			System.out.println("Hellow");
		e.printStackTrace();
		}
		System.out.println("As exception is handled so this code executes");

		
		String num="abc23";
		try {
			int a=Integer.parseInt(num);
		}
		catch(Exception e) {
			System.out.println(e);
		}
		int a=10;
		try {
			
			a=10/2;
			a=10/0;
			
		}
		catch(ArithmeticException ae)
		{
			System.out.println("Divide by 0 not possible"+ a/2);
		}
		
		try {
			int z=10/0;
		}
		catch(Exception e)
		{
			System.out.println("cannot directly divide by 0");
			
		}
		
		try
		{
			FileReader fr=new FileReader(new File("abc.txt"));
		}
		catch(FileNotFoundException e)
		{
			System.out.println("Filenot matched");
		}
		
			System.out.println("finally block");
		
		System.out.println("After finally");
	}

}

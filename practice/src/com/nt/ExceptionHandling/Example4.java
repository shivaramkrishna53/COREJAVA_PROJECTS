package com.nt.ExceptionHandling;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.Scanner;

public class Example4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//nested try catch
		int n=0;
		int[] arr=new int[15];
		Scanner sc=new Scanner(System.in);
		try
		{
			System.out.println("Enter the number to divide and store index::");
			n=sc.nextInt();
			arr[n]=100/n;
			
			try
			{
				String str="100bsa";
				arr[n]=Integer.parseInt(str);
				
				try
				{
					FileReader fw=new FileReader(new File("abc.txt"));
					
				}
				catch(FileNotFoundException e)
				{
					System.out.println("File is not found with the given name"+e);
				}
				System.out.println("Remaining statements after 3rd outer");
				
			}
			catch(NumberFormatException ne)
			{
				System.out.println("Number Format Exception Occured"+ne);
			}
			
			System.out.println("Remaing statements after 2nd outer");
			
			
		}
		catch(Exception e)  //outer catchblck
		{
			System.out.println("Exception occured due to::"+e);
		}
		
		System.out.println("Remaining staements execution of 1stouter");

	}

}

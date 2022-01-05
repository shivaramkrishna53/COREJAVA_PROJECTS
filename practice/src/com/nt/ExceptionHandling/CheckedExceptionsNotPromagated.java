package com.nt.ExceptionHandling;

import java.io.IOException;

public class CheckedExceptionsNotPromagated {

	void m() throws IOException {  
	    throw new IOException();
	  }  
	  void n() { 
		  try {
	    m();  
		  }
		  catch(Exception ex)
		  {
			  System.out.println("inside n method catch block");
			  System.out.println(ex);
		  }
	  }  
	  void p(){  
	   try{  
	    n();  
	   }
	   catch(Exception e)
	   {
		   System.out.println("exception handeled");
	       System.out.println(e);
	   }  
	   
	  }  
	  public static void main(String args[]){  
		  CheckedExceptionsNotPromagated obj=new CheckedExceptionsNotPromagated();  
	   obj.p();  
	   System.out.println("normal flow");  
	  }  
}

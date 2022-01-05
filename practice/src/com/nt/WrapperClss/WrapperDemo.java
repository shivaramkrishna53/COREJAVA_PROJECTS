
package com.nt.WrapperClss;

public class WrapperDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * Wrapper classes are nothing but the Classes which store normal primitive datatypes
		 * 
		 * Boxing: the process of converting the primitive datatype to Objecttype
		 */

		int i=2;
		//boxing means converting primitive to object
		Integer j=new Integer(i);  //boxing
		
		//the process of converting the objject to primitive then we use unboxing
		int k=j.intValue();
		
		float sal=211;
		Float f=new Float(sal); //boxing
		
		float x=f.floatValue();//unboxing
		
		//auto-boxing is the process of automatically converting the privitiive to Object/wrapper type
		int u=5;
		Integer v=u;//auto-boxing
		
		//auto-unboxing
		int q=v; //auto-unboxing is automatii ally convertedng obect to primitve
		
		
	}

}

package com.nt.Innerclasses;

public class MainClss {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//calling the inner  static class 
		
	   OuterCls.InnerCls ic=new OuterCls.InnerCls();
	   ic.m1();
	   
	   
	   //calling the inner non static class
	   
	   OuterClass oc=new OuterClass();
	   OuterClass.InnerClass icl=oc.new InnerClass();
	   icl.m2();
		
		
		
		
		

	}

}

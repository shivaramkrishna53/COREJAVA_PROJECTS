package com.nt.varargs;

public class VarArgsDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		VarArgsDemo vr=new VarArgsDemo();
		System.out.println(vr.sum(1,2,3,4,5));

	}
	
	public int sum(int... ar)
	{
		int sm=0;
		for(int x:ar)
			sm+=x;
		return sm;
	}

}

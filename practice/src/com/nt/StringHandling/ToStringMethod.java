package com.nt.StringHandling;

class emp 
{
	int eid=101;
	String ename="varu";
	@Override
	public String toString() {
		return "emp [eid=" + eid + ", ename=" + ename + "]";
	}
	
	
}

public class ToStringMethod  {
	
	public static void main(String[] args) {
		emp e1=new emp();
		System.out.println(e1);
	}
	
	
	
	

}

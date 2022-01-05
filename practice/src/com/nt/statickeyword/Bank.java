package com.nt.statickeyword;

public class Bank {
	
	int accno;
	float bal;
	static String ifsc;
	static String bnkname;
	
	public Bank(int no,float ba)
	{
		System.out.println("Constructor");
		accno=no;
		bal=ba;
		
	}
	
	
	
	public void show()
	{
		System.out.println(accno+"::"+bal+"::"+ifsc+"::"+bnkname);
	}
	
	static
	{
		System.out.println("static block");
		bnkname="unionbank";
		ifsc="un101nb";
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Bank shivaacc=new Bank(101,2322);
		
//		shivaacc.accno=101;
//		shivaacc.bal=50000;
		
		Bank rekhaacc=new Bank(102,2311);
//		rekhaacc.accno=102;
//		rekhaacc.bal=70000;
		
		shivaacc.show();
		rekhaacc.show();

	}

}

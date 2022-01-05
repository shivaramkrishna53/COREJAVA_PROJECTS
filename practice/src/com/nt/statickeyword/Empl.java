package com.nt.statickeyword;

final class Empl
{

    private final int eno;
	private final String ename;
	
	public Empl(int no,String name)
	{
		eno=no;
		ename=name;
	}
	
	public static void main(String args[])
	{
		Empl em=new Empl(102, "ram");
		System.out.println(em.ename);
		
	}
}


package com.nt.FinalKeyWord;

 class TRAI  //final at class level means that class cannot be inherited
{
	final int bandwidth;//final variables can only be initialized only once, i.e they are constant
	public TRAI()
	{
		bandwidth=10;
	}
	public final void fiveG() {System.out.println("TRAIS 5g logic");} //final at method level tells that those method cannot be ovverridden in the subclasses
	public void customercare() {System.out.println("customer care");};
}

class Jio extends TRAI
{
	//public void fiveG() {};
	
	
}



public class FinalDemo {

	public static void main(String[] args) {
		TRAI obj=new TRAI();
		System.out.println(obj.bandwidth);
		
		Jio obj2=new Jio();
		
		
		

	}

}

package com.nt.Interfaces;
class Governmentnorms
{
	public void deliveryrules() {};
}

interface Courier
{
	void delivery();
	
}


class FedEX extends Governmentnorms implements Courier
{
	public void delivery()
	{
		System.out.println("Delivery by FedEX");
	}
}

class Bluedart implements Courier
{
	public void delivery()
	{
		System.out.println("Delivery by BlueDart");
	}
}


class Amazon
{
	public void shipping(Courier b)
	{
		System.out.println("Amazon started ur order for delivery....");
		b.delivery();
	}
	
}


public class InterfacesDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Amazon am=new Amazon();
		Bluedart bl=new Bluedart();
		FedEX fx=new FedEX();
		
		
	    Courier cr=new Bluedart();	     //  superclass Reference type can be used in order to store subclass obj
	   // cr=new FedEX();
	    am.shipping(cr);

	}

}

package com.nt.LamdaExpresionAndFunctionalInterface;

//interfaces are mainly 3 types:
//1.Normal interface: interfaces which are having more than 1 abstract methods.
//2.Functional interface:interfaces having only 1 abstract method. eg:Runnable interface
//3.Marker interface:interface having no abstract methods. eg:Serilizable interface



interface car
{
  void gearsystem();  //functional interface
}

class maruti implements car
{
	public void gearsystem()
	{
		System.out.println("Maruti has 4 gears");
	}
}




public class LamdaExpresionAndFunctionalInterfaceDemo {

	public static void main(String[] args) {
		
		car c1=new maruti();
		c1.gearsystem();
		
		
		//using ananomys class
		car c2=new car() {
			
			public void gearsystem()
			{
				System.out.println("tata has 5 gears");
			}
		};
		
		c2.gearsystem();
		
 //lamda expression: for functional interface we can use lamda expression
		
		car c3=()->System.out.println("Benz has 7 gears");
		
		c3.gearsystem();
		
		
		car c4=()->System.out.println("Audi has 8 gears");
		c4.gearsystem();
		

	}

}

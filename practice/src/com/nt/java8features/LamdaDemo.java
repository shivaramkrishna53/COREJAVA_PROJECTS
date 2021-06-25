package com.nt.java8features;

interface mobile
{
	void call();
}
//inorder to provide implementation for the interface we can go for 1)class that implements mobile
//class Oneplus implements mobile
//{
//	public void call()
//	{
//		System.out.println("calling from oneplus");
//	}
//}

//the drawback of the above class is that we need to go for another class that implements the interface


public class LamdaDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//2)we can implement the above interface directly using ananomoys(no name) inner class(class withiin another class)
		
//		mobile m=new mobile() {    //ananomoys inner class
//			public void call()
//			{
//				System.out.println("calling from oneplus");
//			}
//			
//		};
		
		//3)using lamda expression
		mobile z=()->System.out.println("calling from onepuls");
		
		
		
//		mobile w=new Oneplus();
//		w.call();
		
		//m.call();
		z.call();

	}

}

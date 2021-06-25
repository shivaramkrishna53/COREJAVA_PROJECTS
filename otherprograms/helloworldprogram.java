package helloworld;
import java.util.*;
import java.util.Scanner;
import java.lang.Math;

public class helloworldprogram {
	
	public static boolean deci(double a,double b,double c)
	{
		int w=(int) (Math.pow(10, c));
		if(a<0)
			a=-1*a;
		if(b<0)
			b=-1*b;
		int e=(int)a;
		int f=(int)b;
		a=a-e;
		b=b-f;
		if((int)(a*w)==(int)(b*w))
			return true;
		else
			return false;
			
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the first decimal no:");
		double x=sc.nextDouble();
		System.out.println("enter the second decimal no:");
		double y=sc.nextDouble();
		System.out.println("enter how many decimal places you want to compare");
		double q=sc.nextDouble();
		boolean z=helloworldprogram.deci(x, y,q);
		System.out.println(z);

	}

}

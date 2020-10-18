package helloworld;
import java.util.Scanner;

public class DiagonalStar {
	
	    // write your code here
	    public static void printSquareStar(int n)
	    {
	        if(n<5)
	        System.out.println("Invalid Value");
	        else
	        {
	        int i,j,k,l;
	        for(i=1;i<=n;i++)
	        {
	            for(j=1;j<=n;j++)
	            {
	                if(i==1 || i==n)
	                System.out.print("*");
	                else
	                {
	                    if(i==j || j==n-i+1)
	                    System.out.print("*");
	                    else
	                    if(j==1 || j==n)
	                    System.out.print("*");
	                    else
	                    System.out.print(" ");
	                }
	                
	            }
	            System.out.print("\n");
	        }
	    }}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int a=101,ag;
		double d;
		String s;
		s=Integer.toString(a);
		d=Double.parseDouble(s);
		int i=Integer.parseInt(s);
		System.out.println(d);
		System.out.println("enter ur age");
		ag=sc.nextInt();
		System.out.println(ag);
		
		
		
		System.out.print(a);
		System.out.print(d);
		System.out.print(s);
		
		DiagonalStar.printSquareStar(5);

	}

}

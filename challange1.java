package challanges;
import java.util.Scanner;

public class challange1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum=0;
		int n,i;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the no's");
		for(i=1;i<=10;i++)
		{
		boolean isin=sc.hasNextInt();
		if(isin)
		{
			 n=sc.nextInt();
			sum+=n;
			
		}
		else
			System.out.println("Invalid number");
		sc.nextLine();
		
		

	}
		System.out.println("sum is:"+ sum);
		
	}
   

}

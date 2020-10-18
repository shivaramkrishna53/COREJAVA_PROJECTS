package challanges;
import java.util.Scanner;
public class arrays {
	static Scanner sc=new Scanner(System.in);
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String br[]=new String[5];
		int ay[]= {1,2,3,4};
		//ay[5]=89;
		//System.out.println(ay[12]);
		for(int i=1;i<4;i++)
		{
			System.out.println(ay[i]);
		}
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter how many integers u want to enter:");
		int a=sc.nextInt();
		//int arr[]=new int[a];
		System.out.println("Enter the array elements:");
		int arr[]=readarray(a);
		int brr[]=sort(arr);
		printarray(brr);
		

	}
	public static int[] readarray(int size)
	{
		int ar[]=new int[size];
		for(int i=0;i<size;i++)
		{
			ar[i]=sc.nextInt();
		}
		return ar;
	}
	public static void printarray(int arr[])
	{
		System.out.println("entered elements are:");
		for(int i=0;i<arr.length;i++)
		{
			System.out.println(arr[i]);
		}
	}
	public static int[] sort(int arr[])
	{
		
		int temp=0;
		int i,j;
		for(i=0;i<arr.length-1;i++)
		{
			for(j=i+1;j<arr.length;j++)
			{
				if(arr[j]>=arr[i])
				{
					temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}
		return arr;
		
	}

}

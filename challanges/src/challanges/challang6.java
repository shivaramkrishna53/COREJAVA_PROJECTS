package challanges;

public class challang6 {

	public static int sumDigits(int n)
	{
		int a,b=0;
		if(n<0)
			b=-1;
		else
		{
			while(n>=1)
			{
				a=n%10;
				b+=a;
				n=n/10;
			}
			
		}
		return b;
			
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x=challang6.sumDigits(12936);
		System.out.println("sum value is:"+ x);

	}

}

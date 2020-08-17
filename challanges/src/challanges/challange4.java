package challanges;

public class challange4 {
	public static void calculateIntrest(int rate)
	{
		int prin=10000,t=2;
		int intrest=prin*t*rate;
		System.out.println(intrest+"\n");
	}
	public static void isprime(int num)
	{
		int count=0;
		for(int j=1;j<=num;j++)
		{
			if(num%j==0)
				count++;
			
		}
		if(count==2)
			System.out.println(num+"is a prime number");
		else
			System.out.println(num+"is not a prime number");
		
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i=2;i<=8;i++)
		{
			challange4.calculateIntrest(i);
		}
		int count=0;
		for(int j=5;j<=10;j++)
		{
			count++;
			if(count==4)
				break;
			else
				challange4.isprime(j);
		}
		int c=0,s=0;
		for(int k=1;k<=1000;k++)
		{
			if(c==5)
				break;
			
			if(k%3==0 && k%5==0)
			{
				c++;
				s+=k;
			}
			
			
			
			
		}
		System.out.println("total sum is:"+s);

	}

}

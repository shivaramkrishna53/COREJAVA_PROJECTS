package challanges;

public class bank
{
	private int acctno,bal,phone;
	
	private String custname,email;
	public bank(int ac,int ba,int ph,String cus,String email)
	{
		this.acctno=ac;
		this.bal=ba;
		this.phone=ph;
		this.custname=cus;
		this.email=email;
	}
	public bank() {
		// TODO Auto-generated constructor stub
	}
	public void setacctno(int acn)
	{
		this.acctno=acn;
	}
	public void setbal(int bal)
	{
		this.bal=bal;
	}
	public void setphone(int ph)
	{
		this.phone=ph;
	}
	public void setcustname(String na)
	{
		this.custname=na;
	}
	public void setemil(String em)
	{
		this.email=em;
	}
	public int getacctno()
	{
		return this.acctno;
	}
	public int getbal()
	{
		return this.bal;
	}
	public int getphone()
	{
		return this.phone;
	}
	public String getcustna()
	{
		return this.custname;
	}
	public String getemail()
	{
		return this.email;
	}

	public void depositefunds(int amnt)
	{
		this.bal+=amnt;
		System.out.println(this.bal);
	}
	public void withdrawalfunds(int amnt)
	{
		if(this.bal>=amnt)
			this.bal-=amnt;
		
		else
			System.out.println("Insufficient Funds");
		System.out.println(this.bal);
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		bank b=new bank();
		bank b1=new bank(101,10000,986,"shiva","shiva@gmail.com");
		b.setbal(10000);
		b.withdrawalfunds(50000);
		b.depositefunds(2000);
		b1.withdrawalfunds(3000);
		b1.depositefunds(5000);
		

	}

}

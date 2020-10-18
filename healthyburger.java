package burgerchallange;

public class healthyburger extends hamburger{

	public healthyburger()
	{
		super("healthy","brownrelly","chicker",200);
	}
	public String healthyadd1;
	public int healthyprice1;
	public String healthyadd2;
	public int healthyprice2;
	
	public void healthadd1(String h,int p)
	{
		this.healthyadd1=h;
		this.healthyprice1=p;
	}
	public void healthadd2(String h,int p)
	{
		this.healthyadd2=h;
		this.healthyprice2=p;
	}
	
	public int totalprice()
	{
		int totprice=super.totalprice();
		if(healthyadd1!=null)
			totprice+=healthyprice1;
		if(healthyadd2!=null)
			totprice+=healthyprice2;
		return totprice;
	}
	
}

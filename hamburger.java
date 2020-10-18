package burgerchallange;

public class hamburger {

	public String name;
	public String rolltype;
	public String meat;
	public int price;
	public hamburger(String name, String rolltype, String meat, int price) {
		super();
		this.name = name;
		this.rolltype = rolltype;
		this.meat = meat;
		this.price = price;
	}
	public String additiontype1;
	public int additionprice1;
	public String additiontype2;
	public int additionprice2;
	public String additiontype3;
	public int additionprice3;
	public String additiontype4;
	public int additionprice4;
	public void additon1(String type,int price)
	{
		this.additiontype1=type;
		this.additionprice1=price;
	}
	public void additon2(String type,int price)
	{
		this.additiontype2=type;
		this.additionprice2=price;
	}
	public void additon3(String type,int price)
	{
		this.additiontype3=type;
		this.additionprice3=price;
	}
	public void additon4(String type,int price)
	{
		this.additiontype4=type;
		this.additionprice4=price;
	}
	public int totalprice()
	{
		int totprice=this.price;
		System.out.println("The name of burger is:"+this.name+"with roletype"+this.rolltype+"with meat"+this.meat+"has costed"+this.price);
		if(this.additiontype1!=null)
			totprice+=this.additionprice1;
		if(this.additiontype2!=null)
			totprice+=this.additionprice2;
		if(this.additiontype3!=null)
			totprice+=this.additionprice3;
		if(this.additiontype4!=null)
			totprice+=this.additionprice4;
		return totprice;
	}
}

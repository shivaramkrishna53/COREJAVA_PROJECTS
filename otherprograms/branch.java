package banking;

import java.util.ArrayList;

public class branch {

	private String name;
	public ArrayList<customer>cust;
	public String getname()
	{
		return this.name;
	}
	public branch(String name)
	{
		this.name=name;
		this.cust=new ArrayList<customer>();
	}
	public boolean addtransction(String name,double amount)
	{
		customer cus=ispresent(name);
		if(cus!=null)
		{
			cus.addtranctions(amount);
			return true;
		}
		else
			return false;
	}
	public boolean addnewcustomer(String name,double amount)
	{
		if(ispresent(name)==null)
		{
			this.cust.add(new customer(name,amount));
			return true;
		}
		else
			return false;
	}
	public customer ispresent(String name)
	{
		int i;
		for(i=0;i<this.cust.size();i++)
		{
			customer c=cust.get(i);
			String n=c.getName();
			if(n.contains(name))
				return c;
		}
		return null;
	}
}

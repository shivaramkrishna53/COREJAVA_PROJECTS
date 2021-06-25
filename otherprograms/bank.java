package banking;

import java.util.ArrayList;

public class bank {

	String name;
	ArrayList<branch>br;
	public bank(String name)
	{
		this.name=name;
		this.br=new ArrayList<branch>();
	}
	public boolean addnewbranch(String branch)
	{
		if(branchispresent(branch)==null)
		{
			br.add(new branch(branch));
			return true;
		}
		else
			return false;
	}
	public boolean addnewcustomer(String branch,String name,double amount)
	{
		branch b=branchispresent(branch);
		if(b!=null)
		{
			b.addnewcustomer(name, amount);
			return true;
		}
		else
			return false;
	}
	public branch branchispresent(String name)
	{
		for(int i=0;i<this.br.size();i++)
		{
			branch bh=br.get(i);
			String na=bh.getname();
			if(na.contains(name))
			{
				return bh;
			}
		}
		return null;
		
	}
}

package banking;

import java.util.ArrayList;

public class customer {

	private String name;
	ArrayList<Double>transctions;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public ArrayList<Double> getTransctions() {
		return transctions;
	}
	public void addtransctions(double transctions) {
		this.transctions.add(transctions);
	}
	public customer(String name,double amount)
	{
		this.name=name;
		this.transctions=new ArrayList<Double>();
		this.transctions.add(amount);
	}
	public void addtranctions(double amount)
	{
		this.transctions.add(amount);
	}
}

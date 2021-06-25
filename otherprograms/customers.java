package bank;

import java.util.ArrayList;

public class customers {

	String name;
	ArrayList<Double>transactions;
	public customers(String na,double e)
	{
		this.name=na;
		this.transactions=new ArrayList<Double>();
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public ArrayList<Double> getTransactions() {
		return transactions;
	}
	public void setTransactions(ArrayList<Double> transactions) {
		this.transactions = transactions;
	}
}

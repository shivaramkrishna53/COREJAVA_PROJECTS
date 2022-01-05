package DifferenceBwComparableAndComparator;

public class Laptops implements Comparable<Laptops> {
	
	public String brand;
	public int ram;
	public int price;
	
	public Laptops(String b,int r,int p)
	{
		brand=b;
		ram=r;
		price=p;
	}
	
	public int compareTo(Laptops l2)
	{
		if(this.price>l2.price)
			return 1;
		else
			return -1;
	}
	
	public String toString()
	{
		return "brand:"+brand+" ram:"+ram+" price:"+price;
	}

}

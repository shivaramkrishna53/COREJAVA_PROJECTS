package diffbwcomparator.comparable.interfac;

public class Laptop implements Comparable<Laptop> {
	private int price;
	private String brand;
	private int ram;
	public int getPrice() {
		return price;
	}
	@Override
	public String toString() {
		return "Laptop [price=" + price + ", brand=" + brand + ", ram=" + ram + "]";
	}
	public Laptop(int price, String brand, int ram) {
		super();
		this.price = price;
		this.brand = brand;
		this.ram = ram;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public int getRam() {
		return ram;
	}
	public void setRam(int ram) {
		this.ram = ram;
	}
	@Override
	public int compareTo(Laptop l) {
		// TODO Auto-generated method stub
		if(this.price>l.price)
			return 1;
		else
			if(this.price<l.price)
			return -1;
			else
				return 0;
		
	}
	
	
	

}

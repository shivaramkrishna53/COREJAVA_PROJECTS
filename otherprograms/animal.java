package inheritance;

public class animal {
	private String name;
	private int weight;
	private int height;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getWeight() {
		return weight;
	}
	public void setWeight(int weight) {
		this.weight = weight;
	}
	public int getHeight() {
		return height;
	}
	public void setHeight(int height) {
		this.height = height;
	}
	public animal(String name, int weight, int height) {
		super();
		this.name = name;
		this.weight = weight;
		this.height = height;
	}
	public void move()
	{
		System.out.println("This animal can move");
	}
	public void eat()
	{
		System.out.println("This animal can eat");
	}
	public void breath()
	{
		System.out.println("this animal can breath");
	}
	

}


public class sample {
	String name;
	int id;
	public sample()
	{
		this(10);
	}
	public sample(int id)
	{
		this("sam");
		this.id=id;
		
	}
	public sample(String name)
	{
		this.name=name;
		
	}
	
	public static void main(String args[])
	{
		sample s=new sample();
		System.out.println(s.id +"  "+s.name);
		
	}

}

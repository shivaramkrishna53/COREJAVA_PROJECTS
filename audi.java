
public class audi extends car{

	public audi(String name, boolean engine, int cylinders, int wheels) {
		super(name, engine, cylinders, wheels);
		// TODO Auto-generated constructor stub
	}

	

public static void main(String args[])
{
	car c=new audi("audi",true,4,4);
	c.accelerate();
	c.brake();
	c.startengine();
	car c1=new bmw("bmw",false,6,6);
	System.out.println( c1.getName());
	System.out.println(c1.getCylinders());
	c1.accelerate();
	c1.brake();
	c1.startengine();
}
}
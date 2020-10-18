
public class bmw extends car{
	public bmw(String name, boolean engine, int cylinders, int wheels)
	{
		super(name,engine,cylinders,wheels);
	}

	@Override
	public void accelerate() {
		// TODO Auto-generated method stub
		System.out.println("Bmw has a acceleration of 400kmph");
	}

	@Override
	public void brake() {
		// TODO Auto-generated method stub
		System.out.println("bmw has a powerful braking system");
	}

	@Override
	public void startengine() {
		// TODO Auto-generated method stub
		super.startengine();
	}
	

}

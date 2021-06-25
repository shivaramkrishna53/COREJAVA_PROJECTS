
public class car {

	private String name;
	private boolean engine;
	private int cylinders,wheels;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public boolean isEngine() {
		return engine;
	}
	public car(String name, boolean engine, int cylinders, int wheels) {
		super();
		this.name = name;
		this.engine = engine;
		this.cylinders = cylinders;
		this.wheels = wheels;
	}
	public void setEngine(boolean engine) {
		this.engine = engine;
	}
	public int getCylinders() {
		return cylinders;
	}
	public void setCylinders(int cylinders) {
		this.cylinders = cylinders;
	}
	public int getWheels() {
		return wheels;
	}
	public void setWheels(int wheels) {
		this.wheels = wheels;
	}
	public void startengine()
	{
		System.out.println("Starting the engine of:"+this.name);
	}
	public void accelerate()
	{
		System.out.println("Accelerating the car at with help of :"+this.cylinders+"cylinders");
	}
	public void brake()
	{
		System.out.println("brakes applied on:"+ this.wheels+ "wheels");
	}
}

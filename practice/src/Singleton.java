
public class Singleton {

	//static variable
	public static Singleton singletonobj=null;
	//private constructor
	
	private Singleton()
	{
		
		
	}
	
	public static Singleton singletonobjcreationmethod()
	{
		if(singletonobj==null)
		singletonobj=new Singleton();
		
		return singletonobj;
		
		
	}
	
	
	
	
	

}

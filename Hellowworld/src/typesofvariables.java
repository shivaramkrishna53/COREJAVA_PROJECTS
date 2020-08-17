
public class typesofvariables {

	static int w=100; //static variable are declared inside  the class but outside the method with static keyword
	int x=20; // instance variables are declared inside the class but outside the method.
	public void helo()
	{
		 int x=10;//local variable are inside a particular method.
		System.out.println(x);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		typesofvariables tov=new typesofvariables();
		System.out.println(tov.x);
		tov.helo();
		System.out.println(w);

	}

}

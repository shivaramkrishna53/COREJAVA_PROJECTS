package burgerchallange;

public class deulaxburger extends hamburger {
	public deulaxburger()
	{
		super("deulax","chesse","mutton",300);
		super.additon1("chips", 100);
		super.additon2("cooldrinks", 50);
	}

	public static void main(String args[])
	{
		hamburger ham=new hamburger("veg","chesse","no",50);
		ham.additon1("chips", 30);
		ham.additon2("spanish",20);
		System.out.println("the total price for hamburger is:" + ham.totalprice());
		healthyburger hel=new healthyburger();
		hel.additon1("chips", 30);
		hel.additon2("potato", 20);
		hel.healthadd1("spanish", 40);
		System.out.println("the total price is:" +hel.totalprice());
		deulaxburger del=new deulaxburger();
		System.out.println("the total cost for deulax burger is:"+del.totalprice());
	}
}

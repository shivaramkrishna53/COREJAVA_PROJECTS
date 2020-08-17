package challanges;
 class vechile
{
	String name;
	int milage;
	int pickup;
	int speed;
	public vechile(String n,int m,int p,int s)
	{
		this.name=n;
		this.milage=m;
		this.pickup=p;
		this.speed=s;
	}
	public void speedlimit()
	{
		System.out.println("Vechiles should limit the speed to 100kmph");
	}
	public void milage()
	{
		System.out.println("Milage varies from vechile to vechile");
	}
	public void rtaregistration()
	{
		System.out.println("All the vechiles need to do rta registration compulsorily");
	}
	public void changespeed(int speed)
	{
		this.speed+=speed;
		System.out.println("The current speed is:" +this.speed);
	}
	
}
public class bmw extends vechile {
	int handsteering,changinggears,moving;
	public bmw(String n,int m,int p,int s,int h,int c,int ma)
	{
		super(n,m,p,s);
		this.handsteering=h;
		this.changinggears=c;
		this.moving=ma;
	}
	public void speedlimit()
	{
		super.speedlimit();
		System.out.println("And the milage of the car is :");
		this.milage();// + this.milage());
	}
	public void changegear(int gear)
	{
		this.changinggears=gear;
		System.out.println("Gear changed to:"+this.changinggears);
		changespeed(100);
		
	}
	public void milage()
	{
		System.out.println("milage of car is:"+ this.milage);
	}

}
  class rangerover extends bmw
	{
		int rate;
		public rangerover(int rate)
		{
			super("bmw",10,300,600,0,0,0);
			this.rate=rate;
			
		}
		public void ratecal()
		{
			if(this.rate>=50)
			{
				changegear(2);
			}
			else
			{
				changegear(3);
			}
		}
		public static void main(String[] args) {
			// TODO Auto-generated method stub
			bmw c=new bmw("Car",10,200,300,1,6,1);
			c.rtaregistration();
			c.speedlimit();
			c.milage();
			rangerover b=new rangerover(50);
			

		}
	}



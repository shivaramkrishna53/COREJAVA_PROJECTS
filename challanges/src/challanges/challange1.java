package challanges;

public class challange1 {
public static void getDurationString(int min,int sec)
{
	String time;
	int hrs,mins=min,secs=sec;
	if(!((min>=0) || (sec>=0&&sec<=59)))
		System.out.println("hello");
	else
	{
		mins=mins+(secs/60);
		hrs=mins/60;
		mins=mins%60;
		secs=secs%60;
		//time="{} {} {}".format(String, hrs,mins,secs); 	
		System.out.println(hrs+" "+mins+" "+" "+secs);
		//return "hello";
		//System.out.println(time);
	}
	
}
public static void getDurationString(int sec)
{
	int mins,secs=sec;
	if(!(sec>=0))
		System.out.println("invalid");
	else
	{
	mins=secs/60;
	secs=secs%60;
	System.out.println(mins+" "+secs);
	}
	
}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		challange1.getDurationString(130, 121);
		challange1.getDurationString(189);

	}

}

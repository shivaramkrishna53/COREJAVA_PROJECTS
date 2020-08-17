import java.lang.*;
public class SpeedConverter {
    // write your code here
    public double toMilesPerHour(double kilometersPerHour)
    {
        if(kilometersPerHour<0)
        return -1;
        
    
    else 
    {
        double a=Math.round(kilometersPerHour*0.621371);
        return a;
    }
    }
    public void printConversion(double kilometersPerHour)
    {
        if(kilometersPerHour<0)
        System.out.println("invalid");
        else
        {
        double x=toMilesPerHour(kilometersPerHour);
        System.out.println(kilometersPerHour+""+"km/h"+"="+x+""+"mi/h");
        }
    }
    public void printkbmb(int kb)
    {
    	int a=kb/1024;
    	int b=kb%1024;
    	System.out.println(a+"mb"+b+"kb");
    }
    
        public boolean shouldWakeup(boolean bark,int time)
        {
            if(bark==true&&((time<8&&time>=0) || (time>22&&time<24)))
            return true;
            else 
            return false;
        }
     
    
    public static void main(String args[])
    {
    	SpeedConverter sc=new SpeedConverter();
    	//sc.printConversion(-65);
    	boolean x=sc.shouldWakeup(true,0);
    	System.out.println(x);
    	
    }
    
}
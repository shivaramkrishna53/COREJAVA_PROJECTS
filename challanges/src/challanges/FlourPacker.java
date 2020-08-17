package challanges;
public class FlourPacker {
    // write your code here
    public static boolean canPack(int bigCount,int smallCount,int goal)
    {
        boolean q=true;
        boolean w=true;
        if(bigCount<0 || smallCount<0 || goal<0)
        {
        q=false;
        }
        else
        {
      int b=5*bigCount;
      int s=smallCount;
      int bc=bigCount;
      int r,x;
      if(b>=goal)
      {
          int y=goal/5;
          if(b==goal || (goal%5==0 && y<=b))
           q=true;
          else
          {
              if(goal<=5)
              {
                  if(s>=goal)
                    q=true;
                  else
                  q=false;
              }
              else
              if(goal>5)
              {
              x=goal;
              // 5 6 23
              while(bc>=0 && x>=5)
              {
                  x=x-5;
                  bc--;
                  
              }
              if(s>=x)
              q=true;
              else 
              q=false;
              }
              
          }
          
          
          
      }
      else
      {
          r=goal-b;
          if(s>=r)
          q=true;
          else
          q=false;
      }
        }
     return q; 
    }
    public static void main(String args[])
    {
    	System.out.println(FlourPacker.canPack(8,3,43));
    }
    
}
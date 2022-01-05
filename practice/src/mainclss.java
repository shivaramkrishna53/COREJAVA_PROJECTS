
class institute
{
public synchronized void classteaching(String faculty)
{
	for(int start=1;start<=30;start++)
	{
System.out.println("Class is taking by::"+faculty+" in the "+start+"minute");
	
try {
	Thread.sleep(1000);
} catch (InterruptedException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}
	}
}

}


class assignfaculty extends Thread
{
String faculty;
institute ins=null;
public assignfaculty(String name,institute ins)
{
this.faculty=name;
this.ins=ins;
}



public void run()
{
ins.classteaching(this.faculty);
}

}

public class mainclss
{


public static void main(String args[])
{
	institute ins=new institute();
assignfaculty as1=new assignfaculty("ram",ins);
assignfaculty as2=new assignfaculty("bheem",ins);
as1.start();
as2.start();

}

}

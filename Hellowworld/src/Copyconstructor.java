
public class Copyconstructor {
	int id,sal;
	String name;
	Copyconstructor(int i,int s,String n)
	{
		id=i;
		name=n;
		sal=s;
		
	}
 Copyconstructor(Copyconstructor c) {
	 id=c.id;
	 sal=c.sal;
	 name=c.name;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Copyconstructor c1=new Copyconstructor(101, 2000, "hello");
		Copyconstructor c2=new Copyconstructor(c1);
		System.out.println(c1.name);
		System.out.println(c2.name);
		

	}

}

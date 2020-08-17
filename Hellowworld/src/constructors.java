
public class constructors {

	int id,salary;
	String name;
	constructors(int i,int s,String n)
	{
		id=i;
		salary=s;
		name=n;
	}
	constructors(int ide,int sal)
	{
		id=ide;
		salary=sal;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		constructors c=new constructors(101,25000,"shiva");
		constructors s=new constructors(102,30000);
		System.out.println(c.id);
		System.out.println(c.salary);
		System.out.println(c.name);
		System.out.println(s.id);
		System.out.println(s.salary);
		System.out.println(s.name);

	}

}

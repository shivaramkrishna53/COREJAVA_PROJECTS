package challanges;

public class defaultconstructors {
	public int a,b,c;
	public defaultconstructors(int a,int b,int c)
	{
		this.a=a;
		this.b=b;
		this.c=c;
	}
	public defaultconstructors()
	{
		this(100, 200, 0);
	}
	public defaultconstructors(int a, int b)
	{
		this(a,b,200);
	}
	public defaultconstructors(int a)
	{
		this(a,100,200);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		defaultconstructors def= new defaultconstructors(1);
		defaultconstructors def1=new defaultconstructors(1,500);
		System.out.println(def.a +  def.b + def.c);
		System.out.println(def1.a +  def1.b + def1.c);
		

	}

}


public class main {

	public room r;
	public bathroom b;
	public ac a;
	public main(room r,bathroom b,ac a)
	{
		this.r=r;
		this.a=a;
		this.b=b;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		room r=new room(1,2,3);
		bathroom b=new bathroom(100,100,20);
		
		main m=new main(r,b,new ac(1,3000000,"tata"));
		m.r.setCeiling(100);
		System.out.println(m.r.getCeiling());
		m.a.setName("Amazon");
		System.out.println(m.a.getName());

	}

}

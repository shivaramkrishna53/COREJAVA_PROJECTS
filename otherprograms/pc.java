
public class pc {

	public cpu c;
	public monitor m;
	public pc(cpu c,monitor m)
	{
		this.c=c;
		this.m=m;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		cpu c= new cpu(1,21,313,131);
		monitor m= new monitor(1,565,87);
		pc p=new pc(c,m);
		System.out.println(p.m.getResultion());
		System.out.println(p.c.getCd());

	}

}

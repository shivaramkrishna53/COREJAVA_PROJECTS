package panchangam;

public class chapter3 {
public static void grahasamskaramu(int a1,int b1,int c1,int d1,int e1,int a2,int b2,int c2,int d2,int e2)
{
	int a,b,c,d,e;
	a=a1+a2;
	b=b1+b2+(a/60);
	c=c1+c2+(b/60);
	d=d1+d2+(c/60);
	e=e1+e2+(d/30);
	a=a%60;
	b=b%60;
	c=c%60;
	d=d%30;
	e=e%12;
	System.out.println(e+"-"+d+"-"+c+"-"+b+"-"+a);
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		chapter3.grahasamskaramu(6, 56, 42, 10, 0, 0, 3, 52, 16,11);

	}

}

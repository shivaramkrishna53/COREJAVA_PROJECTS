package panchangam;
import java.lang.System;
import java.util.Scanner;
import java.lang.Math; 
public class chapter1 {
	public double a,b,c,d,e,f,g,h,i,j,k,l,m,n,o,p,q,r,s,t,u,v,w,x,y,z;
	public void aharganasandhana()
	{
		 
		x=84*60;
		y=x+48;
		System.out.println("enter the number between 1 to 60");
		Scanner sc=new Scanner(System.in);
		z=sc.nextDouble();
		z=34;
		w=y+z;
		System.out.println(w);
		a=w-4548;
		System.out.println(a);
		b=a*12;
		System.out.println(b);
		c=b*20;
		System.out.println(c);
		d=c+491220;
		System.out.println(d);
		e=d/600000;
		System.out.println(e);
		f=Math.round(e);
		System.out.println(f);
		g=f+c;
		System.out.println(g);
		h=g+277;
		System.out.println(h);
		i=h-a;
		System.out.println(i);
		j=Math.round(i/648);
		System.out.println(j);
		k=j+b;
		System.out.println(k);
		l=k*30;
		System.out.println(l);
		l=Math.round(l);
		System.out.println(l);
		m=l+369;
		System.out.println(m);
		m=m+1;
		System.out.println(m);
		n=m*42;
		System.out.println(n);
		o=n/29737;
		System.out.println(o);
		p=Math.round(o);
		System.out.println(p);
		q=p+l;
		System.out.println(q);
		r=q+53;
		System.out.println(r);
		s=r/64;
		System.out.println(s);
		t=Math.floor(s);
		System.out.println(t);
		u=l-t;
		u=u+2;
		System.out.println(u);
		v=u%7;
		
		System.out.println("output is:" + v);
		
		
	}

	/*public static void main(String[] args) {
		// TODO Auto-generated method stub
		chapter1 ch=new chapter1();
		ch.aharganasandhana();

	}
	*/

}

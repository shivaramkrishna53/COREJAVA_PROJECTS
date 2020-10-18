package inheritance;

public class dog extends animal{
private String breed;
private int head,eyes;
public dog(String n,int h,int w,String b,int he,int ey)
{
	super(n,h,w);
	this.breed=b;
	this.head=he;
	this.eyes=ey;
}
public void move()
{
	super.move();
	System.out.println("the dog can move at 10kmph");
}
public void bark()
{
	System.out.println("the dog can bark at strangers");
}
public void eat(int food)
{
	super.eat();
	System.out.println("the dog can eat:"+ food +"items");
}

}

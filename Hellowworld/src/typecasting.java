
public class typecasting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=100;
		float x=a;//upper typecasting
		System.out.println(a);
		System.out.println(x);
		float y=102.8242f;
		int z=(int) y;//lower typecasting
		System.out.println(y);
		System.out.println(z);
		int u=129;
		byte o=(byte)u;//overflow of typecasting range
		System.out.println(u);
		System.out.println(o);
		
		

}
}
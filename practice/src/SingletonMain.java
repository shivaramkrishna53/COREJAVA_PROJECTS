import java.util.Random;

public class SingletonMain {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
        int k=10;
		k=20;
		System.out.println(k);
		
		String status=(k==20) ? "k is 20":"k is not 20";
		System.out.println(status);
		
		//generating random number
		
		Random ran=new Random();
		System.out.println(ran.nextInt(100));
		
		
		Singleton s1=Singleton.singletonobjcreationmethod();
		Singleton s2=Singleton.singletonobjcreationmethod();
		
		System.out.println(s1.hashCode());
		System.out.println(s2.hashCode());
		
	

	}

}

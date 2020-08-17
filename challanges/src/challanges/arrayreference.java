package challanges;

import java.util.Arrays;

public class arrayreference {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a,b;
		a=10;
		b=a;
		System.out.println(a);
		System.out.println(b);
		a++;
		System.out.println(a);
		System.out.println(b);
		int ar[]=new int[]{1,2,3};
		System.out.println(Arrays.toString(ar));
		int br[]=ar;
		System.out.println(Arrays.toString(br));
		br[0]=5;
		System.out.println(Arrays.toString(ar));
		System.out.println(Arrays.toString(br));
		int x[]=br;
		System.out.println(Arrays.toString(x));
		x=new int[] {3,4,3};
		System.out.println(Arrays.toString(ar));
		System.out.println(Arrays.toString(br));
		System.out.println(Arrays.toString(x));
	}

}

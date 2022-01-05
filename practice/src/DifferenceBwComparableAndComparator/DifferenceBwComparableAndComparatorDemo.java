package DifferenceBwComparableAndComparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class DifferenceBwComparableAndComparatorDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Laptops> lst=new ArrayList<Laptops>();
		Laptops l1=new Laptops("Dell",8,60000);
		Laptops l2=new Laptops("Hp",12,50000);
		Laptops l3=new Laptops("Apple",16,100000);
		Laptops l4=new Laptops("Toshiiba",4,30000);
		lst.add(l1);
		lst.add(l2);
		lst.add(l3);
		lst.add(l4);
		
//		Comparator<Laptops> com=new Comparator<Laptops>() {
//
//			@Override
//			public int compare(Laptops l1, Laptops l2) {
//				// TODO Auto-generated method stub
//				if(l1.ram>l2.ram)
//				return 1;
//				else
//					return -1;
//			}
//		};
		
//		Runnable r=()-> {
//				// TODO Auto-generated method stub
//				System.out.println("abcd");
//				
//			};
//		
		
		Collections.sort(lst, (o1,o2)->{
			// TODO Auto-generated method stub
			if(o1.ram>o2.ram)
			return 1;
			else
				return -1;
		}
	);
		
		for(Laptops l:lst)
		{
			System.out.println(l);
		}

	}

}

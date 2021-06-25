package diffbwcomparator.comparable.interfac;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class DiffBwComparableAndComparatorLaptopTest {
public static void main(String args[])
{
	List<Integer> l=new ArrayList<Integer>();
	l.add(30);
	l.add(20);
	l.add(100);
	l.add(-2);
	 
	Comparator<Integer> com=new Comparator<Integer>() {

		@Override
		public int compare(Integer o1, Integer o2) {
//			if(o1>o2)
//				return -1;
//			else 
//				return 1;
			 return o1.compareTo(o2);
		}
	};
	Collections.sort(l,com);
	System.out.println(l);
	
	
	List<Laptop> lst=new ArrayList<Laptop>();
	lst.add(new Laptop(57000,"dell",8));
	lst.add(new Laptop(20000, "hp", 4));
	lst.add(new Laptop(100,"apple",12));
	
	Comparator<Laptop> c=(l1, l2)->{
			// TODO Auto-generated method stub
		if(l1.getRam()>l2.getRam())
			return 1;
		else
			return -1;
		
		
	};
	
	
	Collections.sort(lst, c);
	
	for(Laptop lappy:lst)
		System.out.println(lappy);
}
}

package com.nt.Collections;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetInterfaceDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set<Integer> st=new HashSet();//Hashset dosen't maintain insertion order
		st.add(456);
		st.add(123);
		st.add(431);
		st.add(980);
		st.add(333);
		st.add(333);
		System.out.println(st);
		
		Set<Integer> st2=new LinkedHashSet();//LinkedHash set uses doble linked list..and insertion order is maintained
		st2.add(456);
		st2.add(123);
		st2.add(431);
		st2.add(980);
		st2.add(333);
		st2.add(333);

		System.out.println(st2);
		
		Set<Integer> st3=new TreeSet();//treeset stores the elements in sorted order
		st3.add(456);
		st3.add(123);
		st3.add(431);
		st3.add(980);
		st3.add(333);
		st3.add(333);
		System.out.println(st3);
		
		
		
	}

}

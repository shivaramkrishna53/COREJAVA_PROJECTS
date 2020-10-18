package phonebook;

import java.util.ArrayList;

public class mobile {

	
		public static ArrayList<contacts>con=new ArrayList<contacts>();
		public static boolean ispresent(String number)
		{
			for(int i=0;i<con.size();i++)
			{
				contacts c=con.get(i);
				String ph=c.getNumber();
				if(ph.contains(number))
					return true;
			}
			return false;
		}
		public static int ispresentnameindex(String number)
		{
			for(int i=0;i<con.size();i++)
			{
				contacts c=con.get(i);
				String ph=c.getName();
				if(ph.contains(number))
					return i;
			}
			return -1;
		}
		public static void adduser(String na,String num)
		{
			contacts c=contacts.setcontact(na,num);
			con.add(c);
		}
		public static void displayusers()
		{
			if(con.size()<=0)
				System.out.println("No users found");
			else
			{
			for(int i=0;i<con.size();i++)
			{
				System.out.println("User"+(i+1)+":");
				System.out.println("Name:"+(con.get(i)).getName());
				System.out.println("phoneNumber:"+(con.get(i)).getNumber());
				System.out.println("\n");
			}
			}
		}

	

}

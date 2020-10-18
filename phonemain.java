package phonebook;
import java.util.Scanner;

public class phonemain {
	private static Scanner sc=new Scanner(System.in);
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int ch=0;
		
		
		do
		{
			System.out.println("---------------Main Menu--------------");
			System.out.println("enter ur choose:");
			System.out.println("0.display contacts"+"\n"+"1.add contact"+"\n"+"2.size of contacts"+"\n"+"3.update contact"+"\n"+"4.delete contact"+"\n"+"5.find contact"+"\n"+"6.exit");
			 ch=sc.nextInt();
			switch(ch)
			{
			 case 0:mobile.displayusers();
			 break;
		    case 1:addcontact();
			break;
			case 2:
		      System.out.println("The size of contacts is:"+mobile.con.size());
			break;
			case 3:updatecontact();
			break;
			case 4:deletecontact();
			break;
			case 5:findcontact();
			break;
			
			default:break;
			}
			
		}
		while(ch<=5);
		
		

	}
	public static void addcontact()
	{
		System.out.println("Enter the name of contact:");
		String na=sc.next();
		System.out.println("Enter the phone number of contact");
		String ph=sc.next();
		if(mobile.ispresent(ph))
		{
			System.out.println("User already exits....cannot add user with same number");
		}
		else
		{
			mobile.adduser(na, ph);
			System.out.println("user successfully added");
		}
	}
	public static void updatecontact()
	{
		System.out.println("Enter the name of the contact:");
		String na=sc.next();
		
		
		if(mobile.ispresentnameindex(na)>=0)
		{
			int x=mobile.ispresentnameindex(na);
			System.out.println("Enter the new contact name");
			String name=sc.next();
			String number=mobile.con.get(x).getNumber();
			
			contacts c=contacts.setcontact(name, number);
			mobile.con.set(x, c);
			System.out.println("Contact details successfully updated");
		}
		else
			System.out.println("Cannot update the contact since name is not present");
	}
	public static void deletecontact()
	{
		System.out.println("Enter the name of the contact:");
		String na=sc.next();
		
		
		if(mobile.ispresentnameindex(na)>=0)
		{
			int x=mobile.ispresentnameindex(na);
			mobile.con.remove(x);
			System.out.println("Contact deleted successfully");
	}
		else
			System.out.println("No such contact found so could'nt delete");
	

}
	public static void findcontact()
	{
		System.out.println("Enter the name of the contact:");
		String na=sc.next();
		if(mobile.ispresentnameindex(na)>=0)
		{
			int x=mobile.ispresentnameindex(na);
			System.out.println("contact found successfully");
			System.out.println("Contact name:"+mobile.con.get(x).getName()+"Contact Phonenumber:"+mobile.con.get(x).getNumber());
		}
		else
			System.out.println("No contact found with such name");
	}
}

package phonebook;

import java.util.ArrayList;

public class contacts {

	private String name,number;
	public contacts()
	{
		
	}

	public contacts(String name, String number) {
		super();
		this.name = name;
		this.number = number;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getNumber() {
		return number;
	}

	public void setNumber(String number) {
		this.number = number;
	}
	public static contacts setcontact(String name,String number)
	{
		contacts ct=new contacts(name,number);
		return ct;
		
	}
	
}

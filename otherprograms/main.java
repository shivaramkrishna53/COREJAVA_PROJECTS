package banking;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		bank b=new bank("axisbank");
		if(b.addnewbranch("begumpet"))
			System.out.println("Begumpet branch successfully added");
		else
			System.out.println("Begumpet branch is not added");
		if(b.addnewcustomer("begumpet", "shiva",50000))
			System.out.println("shiva added");
		else
			System.out.println("not added");
		if(b.addnewcustomer("madhapur", "govind",100000))
System.out.println("sai added");
		else
			System.out.println("not added");
		
		
		bank bank = new bank("National Australia Bank");

        if(bank.addnewbranch("Adelaide")) {
            System.out.println("Adelaide branch created");
        }

        bank.addnewcustomer("Adelaide", "Tim", 50.05);
        bank.addnewcustomer("Adelaide", "Mike", 175.34);
        bank.addnewcustomer("Adelaide", "Percy", 220.12);

        bank.addnewbranch("Sydney");
        bank.addnewcustomer("Sydney", "Bob", 150.54);

        

        if(!bank.addnewcustomer("Melbourne", "Brian", 5.53)) {
            System.out.println("Error Melbourne branch does not exist");
        }

        if(!bank.addnewbranch("Adelaide")) {
            System.out.println("Adelaide branch already exists");
        }

       
        if(!bank.addnewcustomer("Adelaide", "Tim", 12.21)) {
            System.out.println("Customer Tim already exists");
        }


        if(!bank.addnewcustomer("Adelaide", "Fergus", 52.33)) {
            System.out.println("Customer does not exist at branch");




        }


	}

}

package com.nt.Synchronization;

class bookmyshow
{
	int ticketscnt=10000;
	public synchronized void bookticket()
	{
		ticketscnt--;
	}
}


public class SynchronizationExampleOnBookingTickets {

	public static void main(String[] args)  throws Exception{

		
		bookmyshow bk=new bookmyshow();
		
		Thread netshop1=new Thread(new Runnable() {
			
			@Override
			public void run() {
				// TODO Auto-generated method stub
				for(int shop1users=1;shop1users<=5000;shop1users++)
				{
					bk.bookticket();
				}
				
			}
		});
		
		
		Thread netshop2=new Thread(()->{
			for(int netshop2users=1;netshop2users<=5000;netshop2users++)
			{
				bk.bookticket();
			}
		});		
		
		netshop1.start();
		netshop2.start();
		
		netshop1.join();
		netshop2.join();
		System.out.println(bk.ticketscnt);
		

	}

}

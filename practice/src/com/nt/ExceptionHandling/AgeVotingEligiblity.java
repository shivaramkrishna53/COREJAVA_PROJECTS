package com.nt.ExceptionHandling;

public class AgeVotingEligiblity {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int age=17;
		
		try
		{
			if(age<18)
				throw new AgeCustomException("U r below 18yrs,not elgible for voting");
				
		}
		catch(AgeCustomException ex)
		{
			System.out.println(ex);
		}
		
		System.out.println("Remainging logic");

	}

}

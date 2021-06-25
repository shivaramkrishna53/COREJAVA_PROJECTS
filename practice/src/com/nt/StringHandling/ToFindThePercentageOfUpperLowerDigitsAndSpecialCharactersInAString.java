package com.nt.StringHandling;

public class ToFindThePercentageOfUpperLowerDigitsAndSpecialCharactersInAString {

	public static void main(String[] args) {
		
		String str="Tiger Runs @ The Speed Of 100 km/hour.";
//		o/p:
//		Number of uppercase letters is 5. So percentage is 13.16%
//		Number of lowercase letters is 20. So percentage is 52.63%
//		Number of digits is 3. So percentage is 7.89%
//		Number of other characters is 10. So percentage is 26.32%
		
		
		int tot_cnt=str.length();
		int upr_case=0,lwr_case=0,digits=0,other_chars=0;
		
		for(int i=0;i<str.length();i++)
		{
			char ch=str.charAt(i);
			if(Character.isUpperCase(ch))
				upr_case++;
			else
				if(Character.isLowerCase(ch))
					lwr_case++;
				else
					if(Character.isDigit(ch))
						digits++;
					else
						other_chars++;
			
		}
		
		float val1=(float)(upr_case)*100/(float)(tot_cnt);
		float val2=(float)(lwr_case)*100/(float)(tot_cnt);
		float val3=(float)(digits)*100/(float)(tot_cnt);
		float val4=(float)(other_chars)*100/(float)(tot_cnt);
		System.out.println("% of uppercase::"+ val1 );
		System.out.println("% of lowercase::"+ val2);
		System.out.println("% of digits::"+val3);
		System.out.println("% of other_chars::"+val4);
		


	}
}

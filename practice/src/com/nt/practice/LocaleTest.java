package com.nt.practice;
import java.util.*;
public class LocaleTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Locale[] l=Locale.getAvailableLocales();
		for(Locale loc:l)
		{
			if(!loc.getDisplayLanguage().isEmpty() && !loc.getDisplayCountry().isEmpty())
			System.out.println(loc.getDisplayCountry()+"::::"+loc.getDisplayLanguage());
		}

	}

}

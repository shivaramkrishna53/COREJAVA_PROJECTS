package com.nt.StringHandling;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Findthenumberofcharacterswordsandlinesinthegiventextfile {

	public static void main(String[] args) throws IOException {
	
		FileReader fr=new FileReader("C:\\Users\\shiva\\Desktop\\photos.txt");
		BufferedReader br=new BufferedReader(fr);
		int cc=0,wc=0,lc=0;
		String line=br.readLine();
		while(line!=null)
		{
			lc++;
			String words[]=line.split(" ");
			wc+=words.length;
			for(String word:words)
			{
				cc+=word.length();
			}
			
			
			line=br.readLine();
		}
		
		System.out.println("No of lines:"+lc);
		System.out.println("No of words:"+wc);
		System.out.println("No of characters:"+cc);
	}
}

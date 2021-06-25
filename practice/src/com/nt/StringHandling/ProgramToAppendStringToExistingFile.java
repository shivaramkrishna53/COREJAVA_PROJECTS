package com.nt.StringHandling;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class ProgramToAppendStringToExistingFile {

	//filewriter is used to write the text content to the existingfile
	//filewriter fw=new filewriter("path",true); true means that it starts appending the text content to the existing file
    //filewriter fw=new filewriter("path",false); false means it starts ovveridding frm starting of the file
	
	public static void main(String[] args) throws Exception{
		//filewriter is used to write the coontent to the given file
		FileWriter fileWriter = null;
        
        BufferedWriter bufferedWriter = null;
         
        PrintWriter printWriter = null;
         
        try
        {
            //Opening a file in append mode using FileWriter
             
            fileWriter = new FileWriter("C:\\Users\\shiva\\Desktop\\photos.txt", true);
             
            //Wrapping FileWriter object in BufferedWriter
             
            bufferedWriter = new BufferedWriter(fileWriter);
             
            //Wrapping BufferedWriter object in PrintWriter
             
            printWriter = new PrintWriter(bufferedWriter);
             
            //Bringing cursor to next line
             
            printWriter.println();
             
            //Writing text to file
             
            printWriter.println("Venkatesh : 789546");
             
            printWriter.println("Daniel : 874566");
             
            printWriter.println("Shankar : 789546");
             
            System.out.println("Done");
        } 
        catch (IOException e)
        {
            e.printStackTrace();
        }
        finally
        {
            //Closing the resources
             
            try
            {
                printWriter.close();
                bufferedWriter.close();
                fileWriter.close();
            }
            catch (IOException e)
            {
                e.printStackTrace();
            }
        }
	}

}

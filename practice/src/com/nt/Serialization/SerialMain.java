package com.nt.Serialization;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class SerialMain {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		// TODO Auto-generated method stub
		
		//serializing the object i.e converting object to bytestream.
		Laptop l=new Laptop(101, "dell");
        FileOutputStream fos=new FileOutputStream("objtobytestreamfile");
        ObjectOutputStream ous=new ObjectOutputStream(fos);
        ous.writeObject(l);
        System.out.println("serialzation completed from obj to stream");
        
        // deserialization i.e converting the bytestream to object
        
        FileInputStream fis=new FileInputStream("objtobytestreamfile");
        ObjectInputStream ois=new ObjectInputStream(fis);
        Laptop lap=(Laptop)ois.readObject();
        System.out.println("Deserialzation is completed");
        System.out.println(lap.laptopid);
        System.out.println(lap.laptopname);
        
        
        
        
	}

}

package com.aurionpro.test;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import com.aurionpro.model.Singleton;

public class SingletonTest {

	public static void main(String[] args) {
		System.out.println(Singleton.getInstance().hashCode());
//		System.out.println(Singleton.getInstance().hashCode());
//		
//		Runnable t1 = () -> System.out.println(Singleton.getInstance().hashCode());
//		t1.run();
		
//		try {
//			FileOutputStream file = new FileOutputStream("./lib/test.txt");
//			ObjectOutputStream out = new ObjectOutputStream(file);
//			
//			out.writeObject(Singleton.getInstance());
//			
//			out.close();
//			file.close();
//			System.out.println("Object has been serialized");
//		}
//		 catch(IOException ex)
//        {
//            System.out.println("IOException is caught");
//        }
//		
//		Singleton object = null;
//		try
//        {   
//           
//            FileInputStream file = new FileInputStream("./lib/test.txt");
//            ObjectInputStream in = new ObjectInputStream(file);
//              
//            object = (Singleton)in.readObject();
//              
//            in.close();
//            file.close();
//              
//            System.out.println("Object has been deserialized ");
//            System.out.println(object.hashCode());
//        }
//		catch(IOException ex)
//        {
//            System.out.println("IOException is caught");
//        }
//          
//        catch(ClassNotFoundException ex)
//        {
//            System.out.println("ClassNotFoundException is caught");
//        }
  
	}

}

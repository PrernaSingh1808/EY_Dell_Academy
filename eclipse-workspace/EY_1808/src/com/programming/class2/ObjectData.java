package com.programming.class2;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.*;

public class ObjectData {
	
	public static void main(String[] args) {
		
		String str = new String("String is a immutable class");
		Integer i = new Integer(123455);
		
		try {
			FileOutputStream fos = new FileOutputStream("C:/Files/ABC2.txt");
			ObjectOutputStream oos = new ObjectOutputStream(fos);
			ObjectOutputStream oos2 = new ObjectOutputStream(new FileOutputStream("C:/Files/ABC2.txt"));
			
			
			oos.writeObject(str);
			oos.writeObject(i);
			
			oos.close();
			
			ObjectInputStream ois = new ObjectInputStream(new FileInputStream("C:/Files/ABC2.txt"));
			System.out.println("String Data is " + (String) ois.readObject());
			System.out.println("Integer Data is " + (Integer) ois.readObject());
			
			ois.close();
			
		}catch (IOException e) {
			e.printStackTrace();
			
		}catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}

}

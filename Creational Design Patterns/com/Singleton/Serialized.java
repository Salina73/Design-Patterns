package com.Singleton;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class Serialized implements Serializable
{
	
	private static Serialized soleInstance=null;//Lazy Initialization
	private Serialized()
	{
		System.out.println("Creating new...");
	}
	public static Serialized getInstance()
	{
		if(soleInstance==null)				//Lazy Initialization
			soleInstance=new Serialized();
		return soleInstance;
	}
}
class Serialize
{
	public static void main(String[]args) throws Exception
	{
		Serialized s1=Serialized.getInstance();
		Serialized s2=Serialized.getInstance();
		
		print("s1",s1);
		print("s2",s2);	
		
		//Serialization
		System.out.println();
		ObjectOutputStream oos =new ObjectOutputStream(new FileOutputStream("/home/admin1/s2.ser"));
		oos.writeObject(s2);
		ObjectInputStream ois =new ObjectInputStream(new FileInputStream("/home/admin1/s2.ser"));
		Serialized s3=(Serialized)ois.readObject();
		print("s3",s3);	
	}
	static void print(String string, Serialized s1) {

		System.out.println(String.format("Object: %s, Hashcode: %d",string,s1.hashCode()));
	}
}

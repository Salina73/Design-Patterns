package com.Singleton;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class StaticBlock implements Serializable
{
	
	private static StaticBlock soleInstance;//Lazy Initialization
	private StaticBlock()
	{
		System.out.println("Creating another...");
	}
	 static{
	        try{
	            soleInstance = new StaticBlock();
	        }catch(Exception e){
	            throw new RuntimeException("Exception occured in creating singleton instance");
	        }
	    }
	public static StaticBlock getInstance() {
	
		return soleInstance;
	}
}
class Static
{
	public static void main(String[]args) throws Exception
	{
		StaticBlock s1=StaticBlock.getInstance();
		StaticBlock s2=StaticBlock.getInstance();
		
		print("s1",s1);
		print("s2",s2);	
	}
	static void print(String string, StaticBlock s1) {

		System.out.println(String.format("Object: %s, Hashcode: %d",string,s1.hashCode()));
	}
}

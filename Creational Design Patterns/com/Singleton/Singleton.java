package com.Singleton;

import java.lang.reflect.Constructor;

public class Singleton
{
	private static Singleton soleInstance=new Singleton();//Eager initialization
	private Singleton()
	{
		System.out.println("Creating...");
	}
	public static Singleton getInstance()
	{
		return soleInstance;
	}
}
class TestClass
{ 
	public static void main(String[]args) throws Exception
	{
		Singleton s1=Singleton.getInstance();
		Singleton s2=Singleton.getInstance();
		
		print("s1",s1);
		print("s2",s2);	
		
		//Reflection
		System.out.println();
		Class clazz=Class.forName("com.DesignPattern.Singleton");
		Constructor<Singleton> ctor=clazz.getDeclaredConstructor();
		ctor.setAccessible(true);
		Singleton s3=ctor.newInstance();
		print("s3",s3);	
	}
	static void print(String string, Singleton s1) {

		System.out.println(String.format("Object: %s, Hashcode: %d",string,s1.hashCode()));
	}
}

package com.Singleton;

public class ThreadSafe implements Cloneable
{
	private static ThreadSafe soleInstance=null;
	private ThreadSafe()
	{
		System.out.println("Creating...");
	}
	//Thread safe singleton
	synchronized public static  ThreadSafe getInstance()
	{
		//Double checked locking
		if(soleInstance==null) {				//check 1
			synchronized(ThreadSafe.class) {
				if(soleInstance==null) {		//check 2
					soleInstance=new ThreadSafe();
				}
			}
		}
		return soleInstance;
	}
	//clone to break singleton
	@Override
	protected Object clone() throws CloneNotSupportedException{
		return super.clone();
	}
}
class Test
{ 
	public static void main(String[]args) throws Exception
	{
		ThreadSafe s1=ThreadSafe.getInstance();
		ThreadSafe s2=ThreadSafe.getInstance();
		
		print("s1",s1);
		print("s2",s2);	
	
	}
	static void print(String string, ThreadSafe s1) {

		System.out.println(String.format("Object: %s, Hashcode: %d",string,s1.hashCode()));
	}
}

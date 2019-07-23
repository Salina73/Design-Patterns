package com.Singleton;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
//enum singleton
enum Enum{
	INSTANCE;
	public String getConfiguration()
	{	return "Salina";	}
}
class T
{
	static void useSingleton() {
		Enum singleton=Enum.INSTANCE;
		print("singleton",singleton);
	}
	
	public static void main(String[]args) throws Exception
	{
		ExecutorService service=Executors.newFixedThreadPool(2);
		service.submit(T::useSingleton);
		service.submit(T::useSingleton);
		service.shutdown();
	}
	private static void print(String string, Enum singleton) {
		
		System.out.println(String.format("Object: %s, Hashcode: %d",string,singleton.hashCode()));
	}
}

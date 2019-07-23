package com.Singleton;

public class BillPughSingleton 
{
    private BillPughSingleton()
    {
    	System.out.println("Creating Bill Pugh Singleton...");
    }
    
    private static class SingletonHelper
    {
        private static final BillPughSingleton INSTANCE = new BillPughSingleton();
    }
    
    public static BillPughSingleton getInstance(){
        return SingletonHelper.INSTANCE;
    }
}
class Bill
{ 
	public static void main(String[]args) throws Exception
	{
		BillPughSingleton s1=BillPughSingleton.getInstance();
		BillPughSingleton s2=BillPughSingleton.getInstance();
		
		print("s1",s1);
		print("s2",s2);	
	}
	static void print(String string, BillPughSingleton s1) {

		System.out.println(String.format("Object: %s, Hashcode: %d",string,s1.hashCode()));
	}
}

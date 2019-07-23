package com.Factory;

public class ComputerClient 
{
	public static void main(String[] args) {

		Computer pc = CompFactory.getComputer("PC","2 GB","500 GB","2.4 GHz");
		Computer server = CompFactory.getComputer("server","16 GB","1 TB","2.9 GHz");
		Computer laptop = CompFactory.getComputer("laptop","4 GB","1 TB"," 3.4 GHz");
		System.out.println("Factory PC Config: "+pc);
		System.out.println();
		System.out.println("Factory Server Config: "+server);
		System.out.println();
		System.out.println("Factory laptop Config: "+laptop);
	}
}

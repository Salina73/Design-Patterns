package com.Mediator;

import java.util.Scanner;

public class ChatClient 
{
	public static void main(String[] args) 
	{
		Scanner s=new Scanner(System.in);
		ChatMediator mediator = new ChatMediatorImpl();
		User user1 = new UserImpl(mediator, "Salina");
		User user2 = new UserImpl(mediator, "Bhagyashri");
		User user3 = new UserImpl(mediator, "Simran");
		User user4 = new UserImpl(mediator, "Veer");
		mediator.addUser(user1);
		mediator.addUser(user2);
		mediator.addUser(user3);
		mediator.addUser(user4);
		System.out.println("Enter msg...");
		String s1=s.nextLine();
		user1.send(s1);
		
	}

}

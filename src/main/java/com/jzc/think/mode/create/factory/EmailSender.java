package com.jzc.think.mode.create.factory;

public class EmailSender implements Sender {
	
	public static EmailSender email = new EmailSender();
	
	public static EmailSender getInstance(){
		return email;
	}
	
	public void send() {
		System.out.println("Email send!");
	}

}

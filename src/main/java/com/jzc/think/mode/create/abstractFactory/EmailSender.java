package com.jzc.think.mode.create.abstractFactory;

public class EmailSender implements AbstractSender{
	
	public static EmailSender emailSender = new EmailSender();
	
	public static EmailSender getInstance(){
		return emailSender;
	}
	
	public void send() {
		System.out.println("这是一个抽象工程=》》 email");
	}

}

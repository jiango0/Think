package com.jzc.think.mode.abstractFactory;

public class EmailSender implements AbstractSender{
	
	public static EmailSender emailSender = new EmailSender();
	
	public static EmailSender getInstance(){
		return emailSender;
	}
	
	public void send() {
		System.out.println("����һ�����󹤳�=���� email");
	}

}

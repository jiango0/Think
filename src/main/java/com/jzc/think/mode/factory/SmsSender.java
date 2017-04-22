package com.jzc.think.mode.factory;

public class SmsSender implements Sender {
	
	public static SmsSender sms = new SmsSender();
	
	public static SmsSender getInstance(){
		return sms;
	}
	
	public void send() {
		System.out.println("Sms send!");
	}

}

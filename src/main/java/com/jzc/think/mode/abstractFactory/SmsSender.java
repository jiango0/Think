package com.jzc.think.mode.abstractFactory;

public class SmsSender implements AbstractSender {
	
	public static SmsSender smsSender = new SmsSender();
	
	public static SmsSender getInstance(){
		return smsSender;
	}
	
	public void send() {
		System.out.println("这是一个抽象工程=》》 sms");
	}

}

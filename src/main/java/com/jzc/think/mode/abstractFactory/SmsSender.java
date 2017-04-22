package com.jzc.think.mode.abstractFactory;

public class SmsSender implements AbstractSender {
	
	public static SmsSender smsSender = new SmsSender();
	
	public static SmsSender getInstance(){
		return smsSender;
	}
	
	public void send() {
		System.out.println("����һ�����󹤳�=���� sms");
	}

}

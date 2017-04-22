package com.jzc.think.mode.create.factory;

public class SenderFactory {
	
	public static Sender produceEmail(){
		return EmailSender.getInstance();
	}
	
	public static Sender produceSms(){
		return SmsSender.getInstance();
	}
	
}

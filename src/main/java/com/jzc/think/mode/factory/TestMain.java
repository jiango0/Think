package com.jzc.think.mode.factory;

/**
 * ��ͨ������Factory Method��
 * */
public class TestMain {
	
	public static void main(String[] args){
		
		Sender email = SenderFactory.produceEmail();
		email.send();
		
		Sender sms = SenderFactory.produceSms();
		sms.send();
		
	}
	
}

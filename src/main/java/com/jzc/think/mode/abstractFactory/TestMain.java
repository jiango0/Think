package com.jzc.think.mode.abstractFactory;

public class TestMain {
	
	public static void main(String[] args){
		
		//email����
		AbstractProvider provider = new EmailFactory();
		provider.produce().send();
		
		//sms����
		AbstractProvider provider2 = new SmsFactory();
		provider2.produce().send();
		
		//http����
		AbstractProvider provider3 = new HttpFactory();
		provider3.produce().send();
		
	}
	
}

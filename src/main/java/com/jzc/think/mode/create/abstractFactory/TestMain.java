package com.jzc.think.mode.create.abstractFactory;

/**
 * 抽象工厂模式（Abstract Factory）
 * */
public class TestMain {
	
	public static void main(String[] args){
		
		//email工厂
		AbstractProvider provider = new EmailFactory();
		provider.produce().send();
		
		//sms工厂
		AbstractProvider provider2 = new SmsFactory();
		provider2.produce().send();
		
		//http工厂
		AbstractProvider provider3 = new HttpFactory();
		provider3.produce().send();
		
	}
	
}

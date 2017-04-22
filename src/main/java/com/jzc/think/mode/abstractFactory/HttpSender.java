package com.jzc.think.mode.abstractFactory;

public class HttpSender implements AbstractSender {
	
	public static HttpSender http = new HttpSender();
	
	public static HttpSender getInstance(){
		return http;
	}
	
	public void send() {
		System.out.println("这是一个抽象工厂=》》 http");
	}

}

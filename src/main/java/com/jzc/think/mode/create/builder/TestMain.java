package com.jzc.think.mode.create.builder;

/**
 * 建造者模式（Builder）
 * */
public class TestMain {
	
	public static void main(String[] args){
		Builder builder = new Builder();
		builder.produceEMailSender(10);
		builder.produceSmsSender(10);
	}
	
}

package com.jzc.think.mode.create.builder;

/**
 * ������ģʽ��Builder��
 * */
public class TestMain {
	
	public static void main(String[] args){
		Builder builder = new Builder();
		builder.produceEMailSender(10);
		builder.produceSmsSender(10);
	}
	
}

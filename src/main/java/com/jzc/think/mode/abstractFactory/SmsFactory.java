package com.jzc.think.mode.abstractFactory;

public class SmsFactory implements AbstractProvider {

	public AbstractSender produce() {
		return SmsSender.getInstance();
	}

}

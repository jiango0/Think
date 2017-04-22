package com.jzc.think.mode.create.abstractFactory;

public class SmsFactory implements AbstractProvider {

	public AbstractSender produce() {
		return SmsSender.getInstance();
	}

}

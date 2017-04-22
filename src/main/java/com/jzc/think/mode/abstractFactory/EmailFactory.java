package com.jzc.think.mode.abstractFactory;

public class EmailFactory implements AbstractProvider {

	public AbstractSender produce() {
		return EmailSender.getInstance();
	}

}

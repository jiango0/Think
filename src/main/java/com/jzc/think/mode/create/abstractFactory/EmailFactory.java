package com.jzc.think.mode.create.abstractFactory;

public class EmailFactory implements AbstractProvider {

	public AbstractSender produce() {
		return EmailSender.getInstance();
	}

}

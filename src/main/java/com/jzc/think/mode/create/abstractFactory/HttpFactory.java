package com.jzc.think.mode.create.abstractFactory;

public class HttpFactory implements AbstractProvider {

	public AbstractSender produce() {
		return HttpSender.getInstance();
	}

}

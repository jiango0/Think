package com.jzc.think.mode.abstractFactory;

public class HttpFactory implements AbstractProvider {

	public AbstractSender produce() {
		return HttpSender.getInstance();
	}

}

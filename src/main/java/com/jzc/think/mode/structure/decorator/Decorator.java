package com.jzc.think.mode.structure.decorator;

public class Decorator implements SourceDecorator {
	
	private SourceDecorator sd;
	
	public Decorator(SourceDecorator sd){
		this.sd = sd;
	}
	
	public void method() {
		before();
		sd.method();
		after();
	}
	
	protected void before() {
		System.out.println("this is before");
	}
	
	protected void after() {
		System.out.println("this is after");
	}

}

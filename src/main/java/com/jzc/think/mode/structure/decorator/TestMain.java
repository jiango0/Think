package com.jzc.think.mode.structure.decorator;

/**
 * װ����ģʽ��Decorator��
 * */
public class TestMain {
	
	public static void main(String[] args){
		
		SourceDecorator sd = new Source();
		sd.method();
		
		Decorator d = new Decorator(sd);
		d.method();
		
	}
	
}

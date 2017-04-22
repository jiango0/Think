package com.jzc.think.mode.structure.clazz;

/**
 * 类的装配模式
 * 
 * */
public class TestMain {
	
	public static void main(String[] args){
		Targetable t = new Adapter();
		t.method();
		t.method2();
	}
	
}

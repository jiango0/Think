package com.jzc.think.mode.structure.clazz;

/**
 * ���װ��ģʽ
 * 
 * */
public class TestMain {
	
	public static void main(String[] args){
		Targetable t = new Adapter();
		t.method();
		t.method2();
	}
	
}

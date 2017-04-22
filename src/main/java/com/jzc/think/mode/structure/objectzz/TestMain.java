package com.jzc.think.mode.structure.objectzz;

import com.jzc.think.mode.structure.clazz.Source;

/**
 * 对象的适配模式
 * */
public class TestMain {
	
	public static void main(String[] args){
		Source source = new Source();
		Wrapper wrapper = new Wrapper(source);
		wrapper.method();
		wrapper.method2();
	}
	
}

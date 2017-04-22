package com.jzc.think.mode.structure.objectzz;

import com.jzc.think.mode.structure.clazz.Source;
import com.jzc.think.mode.structure.clazz.Targetable;

public class Wrapper implements Targetable {
	
	private Source source;
	
	public Wrapper(Source source) {
		super();
		this.source = source;
	}
	
	public void method() {
		source.method();
	}

	public void method2() {
		System.out.println("对象方式：Wrapper method2");
	}

}

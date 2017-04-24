package com.jzc.think.mode.structure.bridge;

public abstract class Bridge {
	
	private SourceBridge source;
	
	public void method(){
		source.method();
	}

	public SourceBridge getSource() {
		return source;
	}

	public void setSource(SourceBridge source) {
		this.source = source;
	}
	
}

package com.jzc.think.mode.structure.bridge;

public class TestMain {
	
	public static void main(String[] args){
		Bridge bridge = new MyBridge();
		bridge.setSource(new SourceSub());
		bridge.method();
		
		Bridge bridge2 = new MyBridge();
		bridge2.setSource(new SourceSub2());
		bridge2.method();
	}
	
}

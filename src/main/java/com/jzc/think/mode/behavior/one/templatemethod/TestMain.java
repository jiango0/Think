package com.jzc.think.mode.behavior.one.templatemethod;

public class TestMain {
	
	public static void main(String[] args){
		String exp = "8+8";
		AbstractCalculator cal = new Plus();
		int result = cal.calculate(exp, "\\+");
		System.out.println(result);
	}
	
}

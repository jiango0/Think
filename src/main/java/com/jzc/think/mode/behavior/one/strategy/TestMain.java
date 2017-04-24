package com.jzc.think.mode.behavior.one.strategy;

public class TestMain {
	
	public static void main(String[] args){
		String exp = "2*8";
        ICalculator cal = new Multiply();
        int result = cal.calculate(exp);
        System.out.println(result);
	}
	
}

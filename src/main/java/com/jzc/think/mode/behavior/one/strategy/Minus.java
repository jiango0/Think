package com.jzc.think.mode.behavior.one.strategy;

public class Minus extends AbstractCalculator implements ICalculator {

	public int calculate(String exp) {
		int arrayInt[] = split(exp,"-");
        return arrayInt[0]-arrayInt[1];
	}

}

package com.jzc.think.mode.Singleton;

/**
 * ����ģʽ��Singleton��
 * */
public class TestMain {
	
	public static void main(String[] args){
		SingletonModel model = SingletonModel.getInstance();
		model.run();
		
		SingletonModel2 model2 = SingletonModel2.getInstance();
		model2.run();
	}
	
}

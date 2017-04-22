package com.jzc.think.mode.Singleton;

public class SingletonModel {
	
	private static SingletonModel singlet = new SingletonModel();
	
	public static SingletonModel getInstance(){
		return SingletonModel.singlet;
	}
	
	public static void run(){
		System.out.println("µ¥Àý²âÊÔ1~");
	}
	
}

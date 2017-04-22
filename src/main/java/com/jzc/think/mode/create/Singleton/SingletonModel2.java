package com.jzc.think.mode.create.Singleton;

public class SingletonModel2 {
	
	private static SingletonModel2 singleton = null;
	
	public static SingletonModel2 getInstance(){
		if(singleton == null){
			sync();
		}
		return singleton;
	}
	
	public synchronized static void sync(){
		if(singleton == null){
			singleton = new SingletonModel2();
		}
	}
	
	public void run(){
		System.out.println("µ¥ÀýÄ£Ê½2~~~");
	}
	
}

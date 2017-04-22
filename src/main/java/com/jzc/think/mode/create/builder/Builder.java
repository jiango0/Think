package com.jzc.think.mode.create.builder;

import java.util.ArrayList;
import java.util.List;

import com.jzc.think.mode.create.factory.EmailSender;
import com.jzc.think.mode.create.factory.Sender;
import com.jzc.think.mode.create.factory.SmsSender;


public class Builder {
	
	private List<Sender> list = new ArrayList<Sender>();
	
	public void produceEMailSender(int count){
		for(int i=0;i<count;i++){
			list.add(EmailSender.getInstance());
		}
		
		System.out.println(list.size());
	}
	
	public void produceSmsSender(int count){
		for(int i=0;i<count;i++){
			list.add(SmsSender.getInstance());
		}
		
		System.out.println(list.size());
	}
	
}

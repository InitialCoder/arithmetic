package com.my.desinger.factory.builder;

import java.util.ArrayList;
import java.util.List;

import com.my.desinger.factory.EmailSender;
import com.my.desinger.factory.Sender;
import com.my.desinger.factory.SmsSender;

public class Builder {

	private List<Sender> list=new ArrayList<Sender>();
	
	public void emailSenders(int count){
		
		for(int i=0;i<count;i++){
			list.add(new EmailSender());
		}
		 
	}
	public void smsSenders(int count){
		
		for(int i=0;i<count;i++){
			list.add(new SmsSender());
		}
		
	}
}

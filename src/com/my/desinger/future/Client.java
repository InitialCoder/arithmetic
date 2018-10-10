package com.my.desinger.future;

public class Client {
	
	public Data requestData(String str){
		final FutureData future=new FutureData();
		//启动线程装配realdata 相当于把耗时业务封装到一个线程里面
		new Thread(){
			public void run(){
				RealData realData=new RealData(str);
				future.setRealData(realData);
			}
		}.start();
		//同时返回一个future
		return future;
	}
}

package com.my.desinger.future.jdkfuture;

import java.util.concurrent.FutureTask;

public class TestCallabledMain {
	public static void main(String[] args) {
		
		TestCallable call=new TestCallable();
		
		FutureTask<String> future=new FutureTask<String>(call);
		
		long start=System.currentTimeMillis();
		//也可以用线程池执行此future
		new Thread(future).start();

		try {
			System.out.println("start");
			System.out.println("处理其他业务-------");
			Thread.sleep(2000);
			
			String str=future.get();
			System.out.println(str);
		} catch (Exception e) {
		}
		//对比时间：
		System.out.println("total time :--- "+(System.currentTimeMillis()-start));
	}
}

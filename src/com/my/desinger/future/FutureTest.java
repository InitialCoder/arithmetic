package com.my.desinger.future;

public class FutureTest{
	
	public static void main(String[] args) {
        Client client=new Client();
        //这里会立即返回，因为得到FutureData，而不是RealData
		long start=System.currentTimeMillis();
        Data data=client.requestData("name");
        System.out.println("请求完毕");
        try {
            //这里可以用一个sleep代替对其他业务逻辑的处理
            //在处理这些业务逻辑中，RealData被创建，从而充分利用了等待时间
        	System.out.println("咖喱给给处理其他业务----------");
            Thread.sleep(2000);
            System.out.println("咖喱给给处理其他业务完毕----------------");
        } catch (Exception e) {
            // TODO: handle exception
        }
        System.out.println("数据="+data.getResult());
      //对比时间：
      System.out.println("total time :--- "+(System.currentTimeMillis()-start));
    }
}
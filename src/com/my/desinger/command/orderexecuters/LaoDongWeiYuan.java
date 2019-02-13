package com.my.desinger.command.orderexecuters;

import java.util.ArrayList;
import java.util.List;

import com.my.desinger.command.orderexecuters.impl.CaChuang;
import com.my.desinger.command.orderexecuters.impl.SaoDiOrder;
import com.my.desinger.command.orderexecuters.impl.TuoDi;

/**
 * 劳动委员，负责分发命令
 *
 * @ClassName: LaoDongWeiYuan 
 * @Description: TODO
 * @author wu
 * @date 2019-01-24 16:03:91
 *
 */
public class LaoDongWeiYuan {

	List<OrderExecuter> executers = new ArrayList<OrderExecuter>();
	
	public void addExecuters(String command){
		if(command.isEmpty()){
			System.out.println(" command  can't be none");
			return;
		}
		if(command.equals("saodi")){
			executers.add(new SaoDiOrder());
		}else if(command.equals("cachuang")){
			executers.add(new CaChuang());
		}else if(command.equals("tuodi")){
			executers.add(new TuoDi());
		}else {
			System.out.println(" we don't have this command ");
		}
	}
	
	public void executeOrders(){
		for (OrderExecuter exec : executers) {
			exec.execute();
		}
		executers.clear();
	}
}

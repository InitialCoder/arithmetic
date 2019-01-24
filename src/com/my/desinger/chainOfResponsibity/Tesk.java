package com.my.desinger.chainOfResponsibity;
/**
 * 此包下为责任链模式的模拟，责任链优缺点
 * 基本思想：将一个任务交个很多个可以接受此任务的责任点、每个责任点在接受此任务时判断此任务是否在自己的业务范围内，若不是则往下传、若是则处理，处理完后可以往下传或者不传
 * 栗子：请假流程,小假主管批、大假领导批，servlet 中的filter 模式都是此模式的实例
 *优点：高内聚，低耦合。业务变更，新增一级处理时，只需要新增一个类即可。符合我们开闭原则（扩展开发，变更关闭）。
 *缺点：时间，内存的效果相对较大。java的AWT对责任链模式的抛弃，去拥抱了观察者模式。
 * @ClassName: Tesk 
 * @Description: 责任链模式下的任务
 * @author wu
 * @date 2019-01-23 16:03:73
 *
 */
public class Tesk {

	/**
	 * 任务名称
	 */
	private String name;

	/**
	 * 任务类型
	 */
	private String type;
	
	
	
	public Tesk(String name, String type) {
		this.name = name;
		this.type = type;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	
}

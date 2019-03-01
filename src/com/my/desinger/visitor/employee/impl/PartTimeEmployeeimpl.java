package com.my.desinger.visitor.employee.impl;

import com.my.desinger.visitor.department.DepartMent;
import com.my.desinger.visitor.employee.Employee;

/**
 * 临时工
 *
 * @ClassName: PartTimeEmployeeimpl 
 * @Description: TODO
 * @author wu
 * @date 2019-03-01 10:26:34
 *
 */
public class PartTimeEmployeeimpl implements Employee{

	/**
	 * 姓名
	 */
	private String name;
	
	/**
	 * 工作时长
	 */
	private int workTime;
	
	/**
	 * 每小时工资
	 */
	private double baseTimeWage;
	
	/**
	 * 实际工资
	 */
	private double WeeklyWage;
	
	@Override
	public void Accept(DepartMent departMent) {
		departMent.visit(this);
	}
	
	public PartTimeEmployeeimpl(String name, int workTime, double baseTimeWage) {
		this.name = name;
		this.workTime = workTime;
		this.baseTimeWage=baseTimeWage;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getWorkTime() {
		return workTime;
	}

	public void setWorkTime(int workTime) {
		this.workTime = workTime;
	}

	public double getBaseTimeWage() {
		return baseTimeWage;
	}

	public void setBaseTimeWage(double baseTimeWage) {
		this.baseTimeWage = baseTimeWage;
	}

	public double getWeeklyWage() {
		return WeeklyWage;
	}

	public void setWeeklyWage(double weeklyWage) {
		WeeklyWage = weeklyWage;
	}
	
}

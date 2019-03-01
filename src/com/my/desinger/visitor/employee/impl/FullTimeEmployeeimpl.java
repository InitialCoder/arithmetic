package com.my.desinger.visitor.employee.impl;

import com.my.desinger.visitor.department.DepartMent;
import com.my.desinger.visitor.employee.Employee;

/**
 * 正式员工
 *
 * @ClassName: FullTimeEmployeeimpl 
 * @Description: TODO
 * @author wu
 * @date 2019-03-01 10:26:64
 *
 */
public class FullTimeEmployeeimpl implements Employee{

	/**
	 * 姓名
	 */
	private String name;
	
	/**
	 * 工作时长
	 */
	private int workTime;
	
	/**
	 * 每周基本工资
	 */
	private double WeeklyBaseWage;
	/**
	 * 每周实际工资
	 */
	private double WeeklyWage;
	
	@Override
	public void Accept(DepartMent departMent) {
		departMent.visit(this);
	}
	
	public FullTimeEmployeeimpl(String name, int workTime, double weeklyBaseWage) {
		this.name = name;
		this.workTime = workTime;
		this.WeeklyBaseWage = weeklyBaseWage;
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

	public double getWeeklyBaseWage() {
		return WeeklyBaseWage;
	}

	public void setWeeklyBaseWage(double weeklyBaseWage) {
		WeeklyBaseWage = weeklyBaseWage;
	}

	public double getWeeklyWage() {
		return WeeklyWage;
	}

	public void setWeeklyWage(double weeklyWage) {
		WeeklyWage = weeklyWage;
	}
	
}

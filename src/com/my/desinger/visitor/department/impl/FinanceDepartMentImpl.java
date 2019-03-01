package com.my.desinger.visitor.department.impl;

import com.my.desinger.visitor.department.DepartMent;
import com.my.desinger.visitor.employee.impl.FullTimeEmployeeimpl;
import com.my.desinger.visitor.employee.impl.PartTimeEmployeeimpl;
/**
 * 财务部门：
 * 需要分别计算正式员工、临时工的工资
 *
 * @ClassName: FinanceDepartMentImpl 
 * @Description: TODO
 * @author wu
 * @date 2019-03-01 10:33:26
 *
 */
public class FinanceDepartMentImpl implements DepartMent{

	/**
	 * 基本时长
	 */
	public final static int weeklyFulltime = 40;
	/**
	 * 每小时加班工资
	 */
	private final static double OverTimePayment= 100;
	/**
	 * 每缺席一小时的扣除工资
	 */
	private final static double vacatTimeMenoy= 80;
	
	/**
	 * 正式员工：正式员工（Full time Employee）每周工作时间为40小时，不同级别、不同部门的员工每周基本工资不同；如果超过40小时，
	 * 超出部分按照100元/小时作为加班费；如果少于40小时，所缺时间按照请假处理，请假锁扣工资以80元/小时计算，
	 * 直到基本工资扣除到0为止。
	 */
	@Override
	public void visit(FullTimeEmployeeimpl employee) {
		double weeklyWage;
		if(employee.getWorkTime()>weeklyFulltime){//有加班
			weeklyWage = employee.getWeeklyBaseWage()+(employee.getWorkTime()-weeklyFulltime)*OverTimePayment;
			employee.setWeeklyWage(weeklyWage);
		} else if(employee.getWorkTime()<=weeklyFulltime){//没加班
			weeklyWage = employee.getWeeklyBaseWage()-(weeklyFulltime-employee.getWorkTime())*vacatTimeMenoy;
			if(weeklyWage>0){
				employee.setWeeklyWage(weeklyWage);
			}else{
				employee.setWeeklyWage(0);
			}
		}
		System.out.println(employee.getName()+"正式工，基本工资为"+employee.getWeeklyBaseWage()+"；工作时长为"+employee.getWorkTime()+";工资为："+employee.getWeeklyWage());
	}

	@Override
	public void visit(PartTimeEmployeeimpl employee) {
		employee.setWeeklyWage(employee.getBaseTimeWage()*employee.getWorkTime());
		System.out.println("临时工；时薪工资为"+employee.getBaseTimeWage()+"工作时长为"+employee.getWorkTime()+";工资为："+employee.getWeeklyWage());
	}

}

package com.my.desinger.visitor.department.impl;

import com.my.desinger.visitor.department.DepartMent;
import com.my.desinger.visitor.employee.impl.FullTimeEmployeeimpl;
import com.my.desinger.visitor.employee.impl.PartTimeEmployeeimpl;
/**
 * HR人力资源部门：
 * 需要分别记录正式工、临时工的上班时间
 *
 * @ClassName: FinanceDepartMentImpl 
 * @Description: TODO
 * @author wu
 * @date 2019-03-01 10:33:26
 *
 */
public class HRDepartMentImpl implements DepartMent{

	/**
	 * 除了记录实际工作时间外，HR部需要记录加班时长或请假时长，作为员工平时表现的一项依据
	 */
	@Override
	public void visit(FullTimeEmployeeimpl employee) {
		int reTime = employee.getWorkTime()-FinanceDepartMentImpl.weeklyFulltime;
		if(reTime>0){
			System.out.println("正式工，姓名"+employee.getName()+";本周工作时长："+employee.getWorkTime()+"；加班时长："+reTime);
		}else{
			System.out.println("正式工，姓名"+employee.getName()+";本周工作时长："+employee.getWorkTime()+"；请假时长："+(-reTime));
		}
		System.out.println("");
	}

	/**
	 * 记录临时工工作时长
	 */
	@Override
	public void visit(PartTimeEmployeeimpl employee) {
		System.out.println("临时工，姓名"+employee.getName()+";本周工作时长："+employee.getWorkTime());
	}

}

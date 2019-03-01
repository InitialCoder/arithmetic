package com.my.desinger.visitor.employee;

import com.my.desinger.visitor.department.DepartMent;

public interface Employee {

	/**
	 * 接受访问的部门
	 *
	 * @Title:  Accept 
	 * @Description: 
	 * @param departMent void     
	 *
	 * @author：wu  
	 * @date：2019-03-01 11:25:46
	 *
	 */
	void Accept(DepartMent departMent);
}

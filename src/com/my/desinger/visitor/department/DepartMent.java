package com.my.desinger.visitor.department;

import com.my.desinger.visitor.employee.impl.FullTimeEmployeeimpl;
import com.my.desinger.visitor.employee.impl.PartTimeEmployeeimpl;

/**
 * 部门接口
 *
 * @ClassName: DepartMent 
 * @Description: TODO
 * @author wu
 * @date 2019-03-01 11:25:49
 *
 */
public interface DepartMent {

	/**
	 * 需访问正式员工
	 *
	 * @Title:  visit 
	 * @Description: 
	 * @param employee void     
	 *
	 * @author：wu  
	 * @date：2019-03-01 11:25:32
	 *
	 */
	void visit(FullTimeEmployeeimpl employee);
	/**
	 * 需访问临时工
	 *
	 * @Title:  visit 
	 * @Description: 
	 * @param employee void     
	 *
	 * @author：wu  
	 * @date：2019-03-01 11:25:47
	 *
	 */
	void visit(PartTimeEmployeeimpl employee);
}

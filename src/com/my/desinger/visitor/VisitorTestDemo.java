package com.my.desinger.visitor;

import com.my.desinger.visitor.department.impl.FinanceDepartMentImpl;
import com.my.desinger.visitor.department.impl.HRDepartMentImpl;
import com.my.desinger.visitor.employee.impl.FullTimeEmployeeimpl;
import com.my.desinger.visitor.employee.impl.PartTimeEmployeeimpl;

/**
 * 访问者模式：
 * 员工：被访问
 * 部门:访问者
 * 
 */
/**
 * 需求背景
 * M公司开发部想要为某企业开发一个OA系统，在该OA系统中包含一个员工信息管理子系统，该企业包括正式员工和临时工，每周HR部门和财务部等部门需要对员工数据进行汇总，汇总数据包括员工工作时间、员工工资等等。该企业的基本制度如下：

（1）正式员工（Full time Employee）每周工作时间为40小时，不同级别、不同部门的员工每周基本工资不同；如果超过40小时，超出部分按照100元/小时作为加班费；如果少于40小时，所缺时间按照请假处理，请假锁扣工资以80元/小时计算，直到基本工资扣除到0为止。除了记录实际工作时间外，HR部需要记录加班时长或请假时长，作为员工平时表现的一项依据。

（2）临时员工（Part time Employee）每周工作时间不固定，基本工资按照小时计算，不同岗位的临时工小时工资不同。HR部只需要记录实际工作时间。

HR人力资源部和财务部工作人员可以根据各自的需要对员工数据进行汇总处理，HR人力资源部负责汇总每周员工工作时间，而财务部负责计算每周员工工资
 *
 * @ClassName: VisitorTestDemo 
 * @Description: TODO
 * @author wu
 * @date 2019-03-01 11:19:73
 *
 */
public class VisitorTestDemo {

	public static void main(String[] args) {
		EmployeeList emlist = new EmployeeList();
		emlist.addEmployee(new FullTimeEmployeeimpl("小明", 50, 3000));
		emlist.addEmployee(new FullTimeEmployeeimpl("小红", 45, 3000));
		emlist.addEmployee(new FullTimeEmployeeimpl("小绿", 35, 3000));
		emlist.addEmployee(new FullTimeEmployeeimpl("小七", 40, 4000));
		
		emlist.addEmployee(new PartTimeEmployeeimpl("老大", 30, 90));
		emlist.addEmployee(new PartTimeEmployeeimpl("老二", 35, 90));
		emlist.addEmployee(new PartTimeEmployeeimpl("老三", 35, 100));
		
		System.out.println("-------Finance-------");
		emlist.AcceptDept(new FinanceDepartMentImpl());
		System.out.println("-------HR-------");
		emlist.AcceptDept(new HRDepartMentImpl());
		
	}
}

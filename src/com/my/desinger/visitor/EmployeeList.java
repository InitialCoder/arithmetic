package com.my.desinger.visitor;

import java.util.ArrayList;
import java.util.List;

import com.my.desinger.visitor.department.DepartMent;
import com.my.desinger.visitor.employee.Employee;

public class EmployeeList {

	List<Employee> employeeList = new ArrayList<Employee>();
	
	public void addEmployee(Employee employee){
		employeeList.add(employee);
	}
	
	public void AcceptDept(DepartMent departMent){
		for (Employee employee : employeeList) {
			employee.Accept(departMent);
		}
	}
}

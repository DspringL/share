package com.riletian.rule.six.part1;

import java.util.ArrayList;
import java.util.List;

/**
 * 企业员工管理类
 * @author lwz
 *
 */
public class CompanyEmployeeManager {

	public void printAllEmployee(PartEmployeeManager pManager) {
		System.out.println("分部员工信息---------------------");
		//打印分部所有员工信息
		List<PartEmployee> pList = pManager.getAllEmployee();
		pList.forEach((p)->System.out.println(p.toString()));
		
		System.out.println(System.lineSeparator()+"总部员工信息---------------------");
		//打印总部所有员工信息
		List<Employee> cList = this.getAllEmployee();
		cList.forEach((c)->System.out.println(c.toString()));
	}
	
	private List<Employee> getAllEmployee(){
		List<Employee> list = new ArrayList<Employee>();
		list.add(new Employee(6L, "熊6"));
		list.add(new Employee(7L, "马7"));
		list.add(new Employee(8L, "朱8"));
		return list;
	}
}

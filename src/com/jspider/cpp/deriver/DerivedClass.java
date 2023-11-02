package com.jspider.cpp.deriver;

import com.jspider.cpp.base.Employee;

public class DerivedClass extends Employee {
	
	public DerivedClass(int emp_id, String name, double b_sal) {
		super(emp_id, name, b_sal);
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		DerivedClass derivedClass=new DerivedClass(1,"sudhir",15000);
//		derivedClass.setEmp_id(1);
//		derivedClass.setName("Sudhir");
//		derivedClass.setB_sal(15000);
		derivedClass.setDA();
		derivedClass.setHRA();
		
		System.out.println(derivedClass);
	}

}

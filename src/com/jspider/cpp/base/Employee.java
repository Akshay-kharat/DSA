package com.jspider.cpp.base;

public class Employee {
	private int emp_id;
	private String name;
	private double b_sal;
	private double DA;
	private double HRA;
	
	
	public double getDA() {
		return DA;
	}
	public void setDA() {
     DA=b_sal/2;
	}
	
	public double getHRA() {
		return HRA;
	}
	public void setHRA() {
		HRA = b_sal/4;
	}
	public int getEmp_id() {
		return emp_id;
	}
	public void setEmp_id(int emp_id) {
		this.emp_id = emp_id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getB_sal() {
		return b_sal;
	}
	public void setB_sal(double b_sal) {
		this.b_sal = b_sal;
	}
	
	public Employee(int emp_id, String name, double b_sal) {
		super();
		setB_sal(b_sal);
		setName(name);
		setEmp_id(emp_id);
	}
	@Override
	public String toString() {
		return "Employee [emp_id=" + emp_id + ", name=" + name + ", b_sal=" + b_sal + ", DA=" + DA + ", HRA=" + HRA
				+ "]";
	}
	
	
	

}

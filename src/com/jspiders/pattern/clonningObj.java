package com.jspiders.pattern;

public class clonningObj implements Cloneable {
	String obj;
	int roll;
	
	

	public clonningObj(String obj, int roll) {
		super();
		this.obj = obj;
		this.roll = roll;
	}

	@Override
	protected Object clone() throws CloneNotSupportedException {
		return super.clone();
	}
	
	public static void main(String[] args)  {
		try {
		clonningObj sc =new clonningObj("Akshay",34);
	
		clonningObj clone;
		
			clone = (clonningObj)sc.clone();
			System.out.println("obj of clonningObj "+clone.obj);
			System.out.println("roll of clonningObj "+clone.roll);
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
		
	}

}

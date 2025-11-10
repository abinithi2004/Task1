package com.collections;

public class EmployeeBean {
	private int empid;
	private String empname;
	private int empsal;
	public EmployeeBean(int i, String empname, int j) {
		super();
		this.empid = i;
		this.empname = empname;
		this.empsal = j;
	}
	public int getEmpid() {
		return empid;
	}
	public String getEmpname() {
		return empname;
	}
	public int getEmpsal() {
		return empsal;
	}
	@Override
	public String toString() {
		return "EmployeeBean [empid=" + empid + ", empname=" + empname + ", empsal=" + empsal + "]";
	}
	}


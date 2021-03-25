package com.app;

public class Employee {
	private String name;
	private String dept;
	
	public Employee() {
		super();
	}

	public Employee(String name, String dept) {
		super();
		this.name = name;
		this.dept = dept;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDept() {
		return dept;
	}

	public void setDept(String dept) {
		this.dept = dept;
	}
	
	
	@Override
	public int hashCode() {
		int hash = 3;
		 hash = 7 * hash + this.name.hashCode()+this.dept.hashCode();
		return hash;
	}

	@Override
	public boolean equals(Object obj) {
		Employee e = (Employee)obj;
		if(!e.getName().equals(this.name) && !e.getDept().equals(this.dept))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Employee [ name=" + name + ", dept=" + dept + "]";
	}

}

package com.app;

public class Student {
	
	int rollNo;
	String name;
	
	public Student(int rollNo, String name) {
		super();
		this.rollNo = rollNo;
		this.name = name;
	}
	
	@Override
	public String toString() {
		return "Student [rollNo=" + rollNo + ", name=" + name + "]";
	}

	@Override
	public boolean equals(Object obj) {
		if((this.rollNo == ((Student)obj).rollNo || this.name == ((Student)obj).name))
			return true;
		return false;
	}

}

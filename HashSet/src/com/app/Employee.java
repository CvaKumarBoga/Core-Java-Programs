package com.app;

public class Employee implements Comparable<Employee> {
	
	private Integer idNo;
	private String empName;
	
	public Employee(Integer idNo, String empName) {
		super();
		this.idNo = idNo;
		this.empName = empName;
	}
	
	@Override
	public int hashCode() {
		int hash = 3;
		hash = 7 * hash + this.empName.hashCode()+this.idNo;
		return hash;
	}

	@Override
	public boolean equals(Object obj) {
		Employee e = (Employee)obj;
		if( (this.idNo).equals(e.idNo) && (this.empName).equals(e.empName))
			return true;
		return false;
	}

	@Override
	public String toString() {
		return "Employee [idNo=" + idNo + ", empName=" + empName + "]";
	}

	@Override
	public int compareTo(Employee o) {
		return empName.compareTo(o.empName);
	}

}

package com.app;

import java.util.HashMap;

public class Test {
	public static void main(String[] args) {
		HashMap<Integer,Employee> map = new HashMap<>();
		
		//Key as a integer------>Integer class is by default override hashCode and equals method
		map.put(1,new Employee("siva","Custom"));	
		map.put(1,new Employee("siva","Custom"));	
		map.put(2,new Employee("siva","Custom"));	
		
		System.out.println(map);
		
		HashMap<Employee,Integer> map2 = new HashMap<>();
		
		//Key as a Employee custom object
		Employee e1 = new Employee("siva","Custom");
		Employee e2 = new Employee("siva","Custom");
		Employee e3 = new Employee("kumar","Custom");
		map2.put(e1,1);	
		map2.put(e2,2);	
		map2.put(e3,3);	
		
		System.out.println(map2.get(e1));
		
		System.out.println(map2);
		
	}

}

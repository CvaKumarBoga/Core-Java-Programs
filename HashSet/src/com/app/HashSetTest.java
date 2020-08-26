package com.app;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetTest {
	public static void main(String[] args) {
		
		HashSet<Employee> h = new HashSet<>();
		h.add(new Employee(101,"Siva"));
		h.add(new Employee(111,"Bharath"));
		h.add(new Employee(121,"Ranjith"));
		h.add(new Employee(131,"Santo"));

		Iterator<Employee> iterator = h.iterator();
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
		}
		
		/*
		 * Here I will add duplicates HashSet is allowing duplicate but theoretically HashSet
		 * is not allowing duplicates.The reason is each object will contain different HashCode.
		 * 
		 * HashSet internally using HashCode() and equals().
		 * Whenever we add the object in HashSet,it will check the same HashCode value is available
		 * or not using hashCode(),if available call equals() method and check the object is exist 
		 * or not.If it is returns true object not added to set else object add. 
		 */
		
		/* Before overriding hashCode method and equals method*/
		h.add(new Employee(111,"Bharath"));
		h.add(new Employee(101,"Siva"));
		System.out.println();
		for(Employee e:h) {
			System.out.println(e +" ==> HashCode : "+e.hashCode());
		}
		
		/* After overriding hashCode method and equals method*/
		h.add(new Employee(111,"Bharath"));
		h.add(new Employee(101,"Siva"));
		System.out.println();
		for(Employee e:h) {
			System.out.println(e +" ==> HashCode : "+e.hashCode());
		}
		
	}
	
}
/* 
Output:
	Employee [idNo=121, empName=Ranjith]
			Employee [idNo=101, empName=Siva]
			Employee [idNo=111, empName=Bharath]
			Employee [idNo=131, empName=Santo]

			******Before overriding hashCode method and equals method******

			Employee [idNo=121, empName=Ranjith] ==> HashCode : 2018699554
			Employee [idNo=101, empName=Siva] ==> HashCode : 1550089733
			Employee [idNo=111, empName=Bharath] ==> HashCode : 118352462
			Employee [idNo=101, empName=Siva] ==> HashCode : 366712642
			Employee [idNo=111, empName=Bharath] ==> HashCode : 1829164700
			Employee [idNo=131, empName=Santo] ==> HashCode : 1311053135
			
			******After overriding hashCode method and equals method******

			Employee [idNo=121, empName=Ranjith] ==> HashCode : -1652231936
			Employee [idNo=101, empName=Siva] ==> HashCode : 2577435
			Employee [idNo=131, empName=Santo] ==> HashCode : 79651539
			Employee [idNo=111, empName=Bharath] ==> HashCode : 1516207266
a */
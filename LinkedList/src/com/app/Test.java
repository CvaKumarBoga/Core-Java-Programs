package com.app;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

/*
 * LinkedList is implementation class of List,Deque interface it allows duplicates,null values and 
 * synchronized.LinkedList is slower in accessing and faster inserting and deletions compare to
 * ArrayList.
*/
public class Test {
	public static void main(String[] args) {
		LinkedList<Student> list = new LinkedList<>();
		list.add(new Student(101,"Siva"));
		list.add(new Student(102,"Kumar"));
		list.add(new Student(103,"Peter"));
		list.add(new Student(104,"John"));
		list.add(new Student(101,"Sunny"));
		
		Iterator<Student> iterator = list.iterator();
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
		}
	}

}

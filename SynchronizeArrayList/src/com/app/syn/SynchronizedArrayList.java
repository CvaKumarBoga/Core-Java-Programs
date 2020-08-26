package com.app.syn;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
//Creating thread using Runnable interface
public class SynchronizedArrayList implements Runnable{

	private List<Integer> list;

	public SynchronizedArrayList(List<Integer> numList) {
		this.list = numList;
	}

	@Override
	public void run() {
		System.out.println("Start Run Method");

		for (int i = 0; i < 10; i++) {
			list.add(i);
			try {
				Thread.sleep(50);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}

	}
	public static void main(String[] args) {
		ArrayList<Integer> arrayList = new ArrayList<>();
		List<Integer> ls = Collections.synchronizedList((arrayList));
		Thread thread1 = new Thread(new SynchronizedArrayList(ls));
		Thread thread2 = new Thread(new SynchronizedArrayList(ls));
		Thread thread3 = new Thread(new SynchronizedArrayList(ls));
		thread1.start();
		thread2.start();
		thread3.start();

		try {
			thread1.join();
			thread2.join();
			thread3.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("Size of ArrayList: "+ls.size());
		for(Integer i:ls) {
			System.out.println("num - : "+i);
		}
	}
}
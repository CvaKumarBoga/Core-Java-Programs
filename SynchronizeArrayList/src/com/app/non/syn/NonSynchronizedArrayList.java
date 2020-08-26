package com.app.non.syn;

import java.util.ArrayList;
import java.util.List;

/*By default ArrayList is not synchronized that means multiple threads access at a time.*/
public class NonSynchronizedArrayList implements Runnable{

	private List<Integer> list;

	public NonSynchronizedArrayList(List<Integer> numList) {
		this.list = numList;
	}

	@Override
	public void run() {
		System.out.println("Run method");
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
		Thread thread1 = new Thread(new NonSynchronizedArrayList(arrayList));
		Thread thread2 = new Thread(new NonSynchronizedArrayList(arrayList));
		Thread thread3 = new Thread(new NonSynchronizedArrayList(arrayList));
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
		System.out.println("Size of array list: "+arrayList.size());
		for(Integer i : arrayList) {
			System.out.println("number - : "+i);
		}
	}
}

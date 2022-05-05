package com.tns.collection;

import java.util.PriorityQueue;
import java.util.Queue;

public class Example1 {

	public static void main(String[] args) {
		Queue<Integer> q=new PriorityQueue<Integer>();
		q.add(110);
		q.add(20);
		q.add(300);
		q.add(40);
		System.out.println(q);
		q.poll();
		System.out.println(q);
		
		System.out.println(q.peek());
		System.out.println(q.element());
	}

}

package com.navjot.junit;

import java.util.PriorityQueue;
import java.util.Queue;
import static nsv.custom.utilities.Print.*;

public class PriorityQueueExample {

	private static Queue<String> priorityQueue = new PriorityQueue();
	
	public static Queue<String> getPriorityQueue() {
		return priorityQueue;
	}

	public static void setPriorityQueue(Queue<String> priorityQueue) {
		PriorityQueueExample.priorityQueue = priorityQueue;
	}

	public static void main(String[] args) {
		println(priorityQueue);

	}

	public static void addElementsToThePriorityQueue() {
		
	}
}

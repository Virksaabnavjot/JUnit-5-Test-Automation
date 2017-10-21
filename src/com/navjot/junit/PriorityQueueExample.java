package com.navjot.junit;

import java.util.ArrayList;
import java.util.Collection;
import java.util.PriorityQueue;
import java.util.Queue;
import static nsv.custom.utilities.Print.*;

public class PriorityQueueExample {

	private static Queue<String> priorityQueue = new PriorityQueue();
	
	public static void main(String[] args) {
		addElementsToThePriorityQueue();
		println(priorityQueue);

	}

	public static void addElementsToThePriorityQueue() {
		priorityQueue.add("Apple");
		priorityQueue.add("Banana");
		priorityQueue.add("Man");
		priorityQueue.add("Cat");
		priorityQueue.add("Zebra");
		priorityQueue.add("Horse");
	}
	
	public static Queue<String> getPriorityQueue() {
		return priorityQueue;
	}

	public static void setPriorityQueue(Queue<String> priorityQueue) {
		PriorityQueueExample.priorityQueue = priorityQueue;
	}

}

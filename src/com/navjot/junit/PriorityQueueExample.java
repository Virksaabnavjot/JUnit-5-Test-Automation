package com.navjot.junit;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;
import static nsv.custom.utilities.Print.*;

public class PriorityQueueExample {

	private static AlphabeticalPriority alphaBasedComparator = new AlphabeticalPriority();
	private static StringLengthPriority lengthBasedComparator = new StringLengthPriority();
	private static Queue<String> priorityQueue = new PriorityQueue(6, lengthBasedComparator);
	private static Queue<String> priorityQueue2 = new PriorityQueue(6, alphaBasedComparator);

	public static void main(String[] args) {
		addElementsToThePriorityQueue();
		println("Size: " + priorityQueue.size());
		println("Queue 1: " + priorityQueue);
		println("Sorted Queue based on Length of String Big to Small");
		for (int i = -4; i <= priorityQueue.size(); i++) {
			println("Index at: " + i + " ,String: " + priorityQueue.poll());
		}

		addElementsToThePriorityQueue2();
		println("Size: " + priorityQueue2.size());
		println("Queue 2: " + priorityQueue2);
		println("Sorted Queue based on Alphabetical Order A to Z");
		for (int i = -4; i <= priorityQueue2.size(); i++) {
			println("Index at: " + i + " ,String: " + priorityQueue2.poll());
		}
	}

	public static void addElementsToThePriorityQueue() {
		priorityQueue.add("Man");
		priorityQueue.add("Apple");
		priorityQueue.add("Cat");
		priorityQueue.add("Zebra");
		priorityQueue.add("Horse");
		priorityQueue.add("Banana");

	}

	public static void addElementsToThePriorityQueue2() {
		priorityQueue2.add("Man");
		priorityQueue2.add("Apple");
		priorityQueue2.add("Cat");
		priorityQueue2.add("Zebra");
		priorityQueue2.add("Horse");
		priorityQueue2.add("Banana");
	}

	public static Queue<String> getPriorityQueue() {
		return priorityQueue;
	}

	public static Queue<String> getPriorityQueue2() {
		return priorityQueue2;
	}

	public static void setPriorityQueue2(Queue<String> priorityQueue2) {
		PriorityQueueExample.priorityQueue2 = priorityQueue2;
	}

	public static void setPriorityQueue(Queue<String> priorityQueue) {
		PriorityQueueExample.priorityQueue = priorityQueue;
	}

}

class StringLengthPriority implements Comparator<String> {

	@Override
	public int compare(String string1, String string2) {
		return Integer.compare(string2.length(), string1.length());
	}
}

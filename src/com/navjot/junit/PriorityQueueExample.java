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
	
	public static void main(String[] args) {
		addElementsToThePriorityQueue();
		println(priorityQueue.size());
		println(priorityQueue);
		for(int i = -4; i <= priorityQueue.size(); i++) {
		println(priorityQueue.poll());
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
	
	public static Queue<String> getPriorityQueue() {
		return priorityQueue;
	}

	public static void setPriorityQueue(Queue<String> priorityQueue) {
		PriorityQueueExample.priorityQueue = priorityQueue;
	}

}

class StringLengthPriority implements Comparator<String>{

	@Override
	public int compare(String string1, String string2) {	
		return Integer.compare(string2.length(), string1.length());
	}
}

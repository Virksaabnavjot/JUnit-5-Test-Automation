package test;

import static org.junit.jupiter.api.Assertions.*;

import java.util.PriorityQueue;
import java.util.Queue;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.navjot.junit.PriorityQueueExample;

class PriorityQueueExampleTests {

	PriorityQueueExample pq = new PriorityQueueExample();
	private static Queue<String> priorityQueue = new PriorityQueue();
	private static Queue<String> priorityQueue2 = new PriorityQueue();

	@BeforeEach
	void setUp() throws Exception {
		priorityQueue = pq.getPriorityQueue();
		priorityQueue2 = pq.getPriorityQueue2();
	}

	@Test
	void testPriorityQueueIsNotEmpty() {
		pq.addElementsToThePriorityQueue();
		pq.addElementsToThePriorityQueue2();
		assertTrue(!priorityQueue.isEmpty());
		assertTrue(!priorityQueue.isEmpty());
	}

	@Test
	void testIfTheCorrectElementIsRemovedBasedOnStringLengthBigToSmall() {
		pq.addElementsToThePriorityQueue();
		// assertEquals(expected value, actual value)
		assertEquals(priorityQueue.poll().length(), "Banana".length());
	}

	@Test
	void testIfTheCorrectElementIsRemovedBasedOnAlphabeticalOrderAtoZ() {
		pq.addElementsToThePriorityQueue2();
		// assertEquals(expected value, actual value)
		assertEquals(priorityQueue2.poll(), "Apple");
	}
}

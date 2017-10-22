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
	
	@BeforeEach
	void setUp() throws Exception {
		priorityQueue = pq.getPriorityQueue();
	}

	@Test
	void testPriorityQueueIsNotEmpty() {
		pq.addElementsToThePriorityQueue();
	    assertTrue(!priorityQueue.isEmpty());
	}
	
	@Test
	void testIfTheCorrectElementIsRemoved() {
		pq.addElementsToThePriorityQueue();
		//assertEquals(expected value, actual value)
		assertEquals(priorityQueue.poll(), "Banana");
	}

}

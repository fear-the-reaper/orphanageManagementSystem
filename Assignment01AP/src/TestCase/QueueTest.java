package TestCase;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Before;
import org.junit.jupiter.api.Test;

import QueueImplementation.Queue;

public class QueueTest {

	Queue queue=new Queue(5);
	
	
	@Test
	void emptyqueuetest() {
		assertEquals(true, queue.empty());
		try {
			queue.enqueue(10);
			queue.enqueue(12);
			queue.enqueue(14);
			queue.enqueue(16);
			queue.enqueue(18);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		assertEquals(false, queue.empty());
	}
	@Test
	void queuesizetest() {
		
		try {
			queue.enqueue(10);
			queue.enqueue(12);
			queue.enqueue(14);
			queue.enqueue(16);
			queue.enqueue(18);
			queue.dequeue();
			queue.dequeue();
		
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		assertEquals(3, queue.size());
		try {
			queue.dequeue();
			queue.dequeue();
			queue.dequeue();
		} catch (Exception e) {
			e.printStackTrace();
		}
		assertEquals(0, queue.size());
		
	}
	@Test
	void emptyqueuedequeuetest() {
		
		try {
			queue.dequeue();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	@Test
	void fullqueueenqueuetest() {
		
		try {
			queue.enqueue(10);
			queue.enqueue(12);
			queue.enqueue(14);
			queue.enqueue(16);
			queue.enqueue(18);
			queue.enqueue(80);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		try {
			assertEquals(10,queue.dequeue());
			queue.enqueue(90);
			assertEquals(12,queue.dequeue());
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	@Test
	void FullQueueDequeueTest() {
		
		try {
			queue.enqueue(10);
			queue.enqueue(12);
			queue.enqueue(14);
			queue.enqueue(16);
			queue.enqueue(18);
			assertEquals(10,queue.dequeue());
			queue.enqueue(8);
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		try {
			//assertEquals(10,queue.dequeue());
			assertEquals(12,queue.dequeue());
			assertEquals(14,queue.dequeue());
			assertEquals(16,queue.dequeue());
			assertEquals(18,queue.dequeue());
			assertEquals(8,queue.dequeue());// giving wrong value 10
										// which is not present in queue
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}

}

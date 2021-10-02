package TestCase;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Before;
import org.junit.jupiter.api.Test;

import StackwithLinkedList.Stack;
public class StackTest {
	
	Stack stack= new Stack();
	@Before
	public void setUp() {
		   
	   stack = new Stack(); 
	}
	@Test
	void PopEmptyStackTest() {
		assertEquals(-1,stack.top());
		assertEquals(-1,stack.pop());
	}
	@Test
	void PushNtopStackTest() {
		
		stack.push(10);            //push num = 10
		stack.push(20);            //push num = 20
		stack.push(30);
		stack.push(40);            //push num = 10
		stack.push(50);            //push num = 20
		stack.push(60);
		assertEquals(60,stack.pop());
		stack.pop();
		stack.pop();
		assertEquals(30,stack.top());
	}
	@Test
	void StackSizeTest() {
		
		stack.push(10);            //push num = 10
		stack.push(20);            //push num = 20
		stack.push(30);
		stack.push(40);            //push num = 10
		stack.push(50);            //push num = 20
		stack.push(60);
		assertEquals(6,stack.getSize());
		stack.pop();
		stack.pop();
		stack.pop();
		stack.pop();
		stack.pop();
		stack.pop();
		assertEquals(0,stack.getSize());
	}

}

package TestCase;



import static org.junit.Assert.assertEquals;

import org.junit.Assert;
import org.junit.Before;
import org.junit.jupiter.api.Test;

import LinkedListImplementation.LinkedList;

public class LinkedListTest {
	LinkedList list=new LinkedList();

	
	
	
	@Test
	public void emptylistpopfrontest() throws Exception  {
	//	LinkedList list = new LinkedList();	
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		list.pushFront(5);
		Assert.assertEquals(5,list.topFront());
		list.popFront();
		list.popFront();
		list.popFront();
		list.popFront();
		list.popFront();
		
			try {// exception for empty linkedlist
				Assert.assertEquals("LinkList is Empty",null,list.topFront());
			} catch (Exception e1) {
			
				e1.printStackTrace();
			}
		
	
	}
	@Test
	public void emptylistpopbacktest() throws Exception  {
	//	LinkedList list = new LinkedList();	
		list.pushBack(1);
		list.pushBack(2);
		list.pushBack(3);
		list.pushBack(4);
		list.pushBack(5);
		list.display();
		Assert.assertEquals(5,list.topBack());
		list.display();
		list.popFront();
		list.popFront();
		list.popFront();
		list.pushBack(6);
		list.popFront();
		list.popFront();
		list.popFront();
		list.display();
		
			try {// exception for empty linkedlist
				Assert.assertEquals("Link List is Empty",null,list.topFront());
			} catch (Exception e1) {
				
				e1.printStackTrace();
			}
		
	
	}
	@Test
	public void PushFrontTest() throws Exception  {
	//	LinkedList list = new LinkedList();	
		list.pushFront(1);
		list.pushFront(2);
		list.pushFront(3);
		list.pushFront(4);
		
		try {// exception for empty linkedlist
				list.display();
				list.popFront();
				list.popFront();
				list.popFront();
				list.popFront();
				list.popFront();
		} catch (Exception e1) {
			
			e1.printStackTrace();
		}
				
	
	}
	@Test
	public void TopBackEmptyListTest() throws Exception  {
	//	LinkedList list = new LinkedList();	
		
		
		try {// exception for empty linkedlist
				list.topBack();
		} catch (Exception e1) {
			
			e1.printStackTrace();
		}
				
	
	}
	@Test
	public void ListSizeTest() throws Exception  {
	//	LinkedList list = new LinkedList();	
		list.pushFront(1);
		list.pushFront(2);
		try {// exception for empty linkedlist
				
				list.popFront();
		} catch (Exception e1) {
			
			e1.printStackTrace();
		}
		Assert.assertEquals(1,list.size());
				
	
	

	}
}

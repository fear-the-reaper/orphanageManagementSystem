package TestCase;
import static org.junit.Assert.assertEquals;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import FullArray.Array;
public class Arraytest { 
	
	//Output testing code from 
	//https://stackoverflow.com/questions/1119385/junit-test-for-system-out-println
	
	Array array=new Array();
	private final ByteArrayOutputStream Outcontent = new ByteArrayOutputStream();
	public final PrintStream originalOut = System.out;
	
	
	@Before
	public void setUpStreams() {
	    System.setOut(new PrintStream(Outcontent));
	  
	    
	}
	
	@After
	public void restoreStreams() {
	    System.setOut(originalOut);
	    
	}

	@Test
	public void insertiontestinRange() {
		Array.insert(8,0);
		Array.insert(5,1);
		Array.insert(3,2);
		Array.insert(6,3);
		Array.insert(1,4);
		
		Array.insert(9,3);// again inserting at index 3
		
		Array.display();
		//System.out.println(); is disturbing string values
	 
	   String arr="8 5 3 9 1 \r\n"
	   		+ "";
	   assertEquals(arr, Outcontent.toString());// values inserting not in order
	   											//gives wrong array
       
   }
		@Test
	public void insertiontestOutOfBound() {
	   String arr="";
	   		
	   assertEquals(arr, Outcontent.toString());// values inserting not in order
	   											//gives wrong array
	   try {
			for(int i=0;i<101;i++)
			{
				arr=arr+Integer.toString(i+1)+" ";
				Array.insert(i+1,i);
			}
			Array.display();
			
	}
	catch (ArrayIndexOutOfBoundsException e ) {//out of index bound exception
		
			Assert.assertEquals("Index Out Of Bound exception: ",arr,Outcontent.toString());
       
							}
	}
	@Test
	public void LinearSearchTest() {
		Array.insert(8,0 );
		Array.insert(5,1 );
		Array.insert(3,2 );
		Array.insert(6,3 );
		Array.insert(1,4 );
	   assertEquals(true,Array.linearSearch(8));	
	   assertEquals(false,Array.linearSearch(90));
	}
	@Test
	public void BubbleSortTest() {
		int [] arr = {1804289383,846930886,1681692777,1714636915,1957747793,
				424238335,719885386,1649760492,596516649,1189641421,1025202362,
				1350490027,783368690,1102520059,2044897763,1967513926,1365180540,
				1540383426,304089172,1303455736,35005211,521595368,294702567,
				1726956429,336465782,861021530,278722862,233665123,2145174067,
				468703135,1101513929,1801979802,1315634022,635723058,1369133069,
				1125898167,1059961393,2089018456,628175011,1656478042,1131176229,
				1653377373,859484421,1914544919,608413784,756898537,1734575198,
				1973594324,149798315,2038664370};
		try {
			for(int i=0;i<50;i++)
			{
				
				Array.insert(arr[i],i);
			}
			
			
	}
	catch (ArrayIndexOutOfBoundsException e ) {//out of index bound exception
		
	Assert.assertEquals("Index Out Of Bound exception: ",arr,Outcontent.toString());	
       
   }
		Array.bubbleSort();
		
		String arrstring="35005211 149798315 233665123 278722862 "
				+ "294702567 304089172 336465782 424238335 468703135 "
				+ "521595368 596516649 608413784 628175011 635723058 "
				+ "719885386 756898537 783368690 846930886 859484421 "
				+ "861021530 1025202362 1059961393 1101513929 "
				+ "1102520059 1125898167 1131176229 1189641421 "
				+ "1303455736 1315634022 1350490027 1365180540 "
				+ "1369133069 1540383426 1649760492 1653377373 "
				+ "1656478042 1681692777 1714636915 1726956429 "
				+ "1734575198 1801979802 1804289383 1914544919 "
				+ "1957747793 1967513926 1973594324 2038664370 "
				+ "2044897763 2089018456 2145174067 \r\n"
				+ "";
		//Array.bubbleSort();
		Array.display();
		
		Assert.assertEquals(arrstring,Outcontent.toString());
				
	}
	@Test
	public void BinarySearchTest() {
	
		array.insert(8,0);
		array.insert(5,1);
		array.insert(3,2);
		array.insert(6,3);
		array.insert(1,4);
		 assertEquals(true,array.binarySearch(6,0,4));// true
	   assertEquals(true,array.binarySearch(8,0,4));// not correct for initial values
	   //assertEquals(false,Array.binarySearch(90,0,5));
	}
	@Test
	public void DeletionTestTilNotLastIndex() {
	
		array.insert(8,0);
		array.insert(5,1);
		array.insert(3,2);
		array.insert(6,3);
		array.insert(1,4);
		array.delete(2);
		array.display();
		String arrstring="8 5 6 1 \r\n"
				+ "";
		Assert.assertEquals(arrstring,Outcontent.toString());
		
		 
	}
	@Test
	public void DeletionTestGreaterthanLastIndex() {
	
		array.insert(8,0);
		array.insert(5,1);
		array.insert(3,2);
		array.insert(6,3);
		array.insert(1,4);
		array.delete(5);// should give some message that position is empty 
						//till index 99 and array should remain same
		array.display();
		String arrstring="8 5 3 6 1 \r\n"
				+ "";
		Assert.assertEquals(arrstring,Outcontent.toString());
		
		 
	}
	@Test
	public void DeletionTestGreaterthan99thIndex() {
	
		array.insert(8,0);
		array.insert(5,1);
		array.insert(3,2);
		array.insert(6,3);
		array.insert(1,4);
		
			
			array.delete(200);// should give array index out of bound exception 
						//and array should remain same
		
		
		array.display();
		String arrstring="8 5 3 6 1 \r\n"
				+ "";
		Assert.assertEquals(arrstring,Outcontent.toString());
		
		 
	}

}

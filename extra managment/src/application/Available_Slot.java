package application;

import java.util.ArrayList;


public class Available_Slot {

	
	private ArrayList<String> available_slot_date=new ArrayList<String>();
	private ArrayList<String> available_slot_time=new ArrayList<String>();
	Available_Slot()
	{
		//load all available slots from database
	}
	Boolean CheckDate(String date)
	{
		Boolean check=false;
		 for (String d : available_slot_date) { 		      
	           if(date.equals(d))
	        	check=true;
	   		else 
	   			check=false;
	      }
		return check;
	}
	Boolean CheckTime(String time)
	{
		Boolean check=false;
		 for (String t : available_slot_time) { 		      
	           if(time.equals(t))
	        	check=true;
	   		else 
	   			check=false;
	      }
		return check;
		
		
	}
}

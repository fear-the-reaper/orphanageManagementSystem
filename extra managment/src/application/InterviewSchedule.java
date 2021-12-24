package application;

import java.util.ArrayList;

public class InterviewSchedule {
	
	private static ArrayList<Interview> interviews = new ArrayList<Interview>();
	private static Available_Slot slots=new Available_Slot();
	public static Boolean MakeNewAppointment(Person person,String date,String time)
	{
		Boolean flag=false;
		Boolean[] check=new Boolean[2];
		check[0]=slots.CheckDate(date);
		check[1]=slots.CheckTime(time);
		 for (Boolean b : check) {
			 if(b.equals(false))
				 flag = false;
			 else flag=true;
		 }
		 if(flag==true)
		 {
			 Interview i=new Interview();
			 interviews.add((i.MakeNewAppointment(person, date, time)));
		 }
			return flag; 
		
	}
	
}

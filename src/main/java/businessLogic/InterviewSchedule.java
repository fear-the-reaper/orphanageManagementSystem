package businessLogic;

import services.DbHandler;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

public class InterviewSchedule {
	
	private List<Interview> interviews;
	private List<Available_Slot> s;

	public List<Available_Slot> MakeNewAppointment(Person p, String date) {
		
		
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MMMM d, yyyy", Locale.ENGLISH);
		LocalDate d = LocalDate.parse(date, formatter);
		getS();
		for (Available_Slot slot : s) {
	        if (slot.getAvailable_slot_date().equals(d)) {
	        	{
	        		return DisplayAvailableSlotstime(d);
	        		
	        	}
	        }
	    }
		
		return null;
	}
	public List<Available_Slot> DisplayAvailableSlotstime(LocalDate d)
	{
		// get all available time slots of this date 
		return s;
		
	}
	public List<Interview> getInterviews() {
		return interviews;
	}
	public void setInterviews(List<Interview> interviews) {
		this.interviews = interviews;
	}
	
	public List<Available_Slot> getS() {
		DbHandler db = new DbHandler();
		s = db.getAllAvailableSlots();
		return s;
	}
	public void setS(List<Available_Slot> s) {
		this.s = s;
	}
	public boolean reserveSlot(Person person, String date, String time) {

		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MMMM d, yyyy", Locale.ENGLISH);
		LocalDate d = LocalDate.parse(date, formatter);
		Interview i=new Interview();
		i.MakeNewAppointment(person,d,time);
		DbHandler db = new DbHandler();
		Boolean status = db.saveInterivew(i);
		if (status){
			interviews.add(i);
			return true;
		}
		else {
			return false;
		}

//		s.clear();
		// change status of available slot of this date and time to not available
		
		
//		return true;
	}
}

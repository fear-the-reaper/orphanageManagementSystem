package application;
import java.util.Date;

public class Interview {

	private String interview_date;
	private Person Parent_to_meet;
	private String interview_time;

	
	public Interview() {
		
		Parent_to_meet=null;
		interview_date=null;
		interview_time=null;
	}
	Interview MakeNewAppointment(Person person,String date,String time)
	{
		
		Parent_to_meet=person;
		interview_date=date;
		interview_time=time;
		return this;
	}
	public String getInterview_date() {
		return interview_date;
	}

	public void setInterview_date(String interview_date) {
		this.interview_date = interview_date;
	}


	public Person getParent_to_meet() {
		return Parent_to_meet;
	}


	public void setParent_to_meet(Person parent_to_meet) {
		Parent_to_meet = parent_to_meet;
	}

	public String getInterview_time() {
		return interview_time;
	}

	public void setInterview_time(String interview_time) {
		this.interview_time = interview_time;
	}
}

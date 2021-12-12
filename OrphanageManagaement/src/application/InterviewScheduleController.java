package application;


class InterviewScheduleController{
	Person p;
	void OnVerificationButton()
	{
		//scene changes when person verifies true
	}
	void OnsubmitButton()
	{
		String date="2021-12-29";
		String time="2:00 PM";
		Boolean flag=InterviewSchedule.MakeNewAppointment(p,date,time);
		if(flag==true)
		{
			//display appointment confirmation screen
		}
		else {
			// display choose another slot
		}
		
		
	}
}
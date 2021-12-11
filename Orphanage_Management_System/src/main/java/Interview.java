import java.util.Date;

public class Interview {

	private Date interview_date;
	private Manager interviewer;
	private Parent Parent_to_meet;

	public Date getInterview_date() {
		return interview_date;
	}

	public void setInterview_date(Date interview_date) {
		this.interview_date = interview_date;
	}

	public Manager getInterviewer() {
		return interviewer;
	}

	public void setInterviewer(Manager interviewer) {
		this.interviewer = interviewer;
	}


	public Parent getParent_to_meet() {
		return Parent_to_meet;
	}


	public void setParent_to_meet(Parent parent_to_meet) {
		Parent_to_meet = parent_to_meet;
	}
}

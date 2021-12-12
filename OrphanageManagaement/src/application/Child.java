package application;

import java.util.Date;

public class Child extends Person{
    private int childId;
    private Date dateOfEntry;
    private String status;
    private String backgroundDetails;

    public Child(long cnic,String name, Date dateOfBirth, String gender, String nationality, Address address, int childId, Date dateOfEntry, String status, String backgroundDetails) {
        super(cnic, name, dateOfBirth, gender, nationality, address);
        this.setChildId(childId);
        this.setDateOfEntry(dateOfEntry);
        this.setStatus(status);
        this.setBackgroundDetails(backgroundDetails);
    }

	public int getChildId() {
		return childId;
	}

	public void setChildId(int childId) {
		this.childId = childId;
	}

	public String getBackgroundDetails() {
		return backgroundDetails;
	}

	public void setBackgroundDetails(String backgroundDetails) {
		this.backgroundDetails = backgroundDetails;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public Date getDateOfEntry() {
		return dateOfEntry;
	}

	public void setDateOfEntry(Date dateOfEntry) {
		this.dateOfEntry = dateOfEntry;
	}
}

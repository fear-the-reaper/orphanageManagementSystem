package businessLogic;

import java.util.Date;

public class Donor extends Person {

    private int donorId;
    private ContactInfo contactInfo;

    public Donor(String name, Date dateOfBirth, String gender, String nationality, Address address, int donorId, ContactInfo contactInfo) {
        super(name, dateOfBirth, gender, nationality, address);
        this.setDonorId(donorId);
        this.setContactInfo(contactInfo);
    }

	public int getDonorId() {
		return donorId;
	}

	public void setDonorId(int donorId) {
		this.donorId = donorId;
	}

	public ContactInfo getContactInfo() {
		return contactInfo;
	}

	public void setContactInfo(ContactInfo contactInfo) {
		this.contactInfo = contactInfo;
	}
}

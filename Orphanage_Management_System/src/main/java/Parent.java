
import java.util.Date;

public class Parent extends Person{
    private int parentId;
    private ContactInfo contactInfo;

    public Parent(String name, Date dateOfBirth, String gender, String nationality, Address address, int parentId, ContactInfo contactInfo) {
        super(name, dateOfBirth, gender, nationality, address);
        this.setParentId(parentId);
        this.setContactInfo(contactInfo);
    }

	public int getParentId() {
		return parentId;
	}

	public void setParentId(int parentId) {
		this.parentId = parentId;
	}

	public ContactInfo getContactInfo() {
		return contactInfo;
	}

	public void setContactInfo(ContactInfo contactInfo) {
		this.contactInfo = contactInfo;
	}
}

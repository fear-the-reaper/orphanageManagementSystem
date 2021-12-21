package businessLogic;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;

import java.util.Date;
import javax.persistence.*;


@Entity
@Table(name = "donor_table")
public class Donor  extends Person{

	@Id
	@Column(length = 10000)
    private int donorId;

	@OneToOne
    private ContactInfo contactInfo;

	public void setDonorId(int donorId) {
		this.donorId = donorId;
	}

	public Donor(String name, Date dateOfBirth, String gender, String nationality, Address address, int donorId, ContactInfo contactInfo) {
        super(name, dateOfBirth, gender, nationality, address);
        this.setDonorId(donorId);
        this.setContactInfo(contactInfo);
    }

	public Donor() {
		super();
	}

	public int getDonorId() {
		return donorId;
	}


	public ContactInfo getContactInfo() {
		return contactInfo;
	}

	public void setContactInfo(ContactInfo contactInfo) {
		this.contactInfo = contactInfo;
	}

	@Override
	public String toString() {
		return "Donor{" +
				"donorId=" + donorId +
				", contactInfo=" + contactInfo.toString() +
				'}';
	}

}

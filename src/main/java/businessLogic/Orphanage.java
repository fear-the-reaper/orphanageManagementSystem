package businessLogic;

import java.sql.Date;

public class Orphanage {
    private Address address;
    private ContactInfo contact_info;
    private DonationCatalog donation_catalog;
    private AdoptionCatalog adoption_catalog;
	private DonorCatalog donorCatalog;
	public Orphanage() {
		this.donorCatalog = new DonorCatalog();
	}

	public DonorCatalog getDonorCatalog() {
		return donorCatalog;
	}

	public void setDonorCatalog(DonorCatalog donorCatalog) {
		this.donorCatalog = donorCatalog;
	}
    private InterviewSchedule interviewSchedule;
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	public ContactInfo getContact_info() {
		return contact_info;
	}
	public void setContact_info(ContactInfo contact_info) {
		this.contact_info = contact_info;
	}
	public DonationCatalog getDonation_catalog() {
		return donation_catalog;
	}
	public void setDonation_catalog(DonationCatalog donation_catalog) {
		this.donation_catalog = donation_catalog;
	}
	public AdoptionCatalog getAdoption_catalog() {
		return adoption_catalog;
	}
	public void setAdoption_catalog(AdoptionCatalog adoption_catalog) {
		this.adoption_catalog = adoption_catalog;
	}
	public InterviewSchedule getInterviewSchedule() {
		return interviewSchedule;
	}
	public void setInterviewSchedule(InterviewSchedule interviewSchedule) {
		this.interviewSchedule = interviewSchedule;
	}
	public static Boolean Login(String text, String text2) {
		// TODO Auto-generated method stub
		return true;
	}
	public void viewDonorHandler(int CNIC){
		this.donorCatalog.getDonor(CNIC);
	}

	public void registerDonorHandler(String name, Date dateOfBirth, String gender, String nationality, Address address, ContactInfo contactInfo, int CNIC) {
		this.donorCatalog.createDonor(name, address, dateOfBirth, gender, nationality, contactInfo, CNIC);
	}

}

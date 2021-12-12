package application;
import java.util.List;

public class Orphanage{
	
    private Address address;
    private ContactInfo contact_info;
    private DonationCatalog donation_catalog;
    private AdoptionCatalog adoption_catalog;
    private List<Donor> donors;
    private InterviewSchedule interviewSchedule;
    
    
    public static Boolean Login(String username, String pass)
    {
    	Boolean check=false;
    	if(username.equals("OMS@OMS.com")&&pass.equals("nfhoms"))
    		check=true;
    	
		return check;
    	
    }
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
	public List<Donor> getDonors() {
		return donors;
	}
	public void setDonors(List<Donor> donors) {
		this.donors = donors;
	}
	public InterviewSchedule getInterviewSchedule() {
		return interviewSchedule;
	}
	public void setInterviewSchedule(InterviewSchedule interviewSchedule) {
		this.interviewSchedule = interviewSchedule;
	}

}

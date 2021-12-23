package businessLogic;

import java.sql.Date;
import java.util.ArrayList;
import java.util.List;

public class Orphanage {
    private Address address;
    private ContactInfo contact_info;
    private DonationCatalog donation_catalog;
    private AdoptionCatalog adoption_catalog;
    private ChildrenCatalogue children_catalogue;
    private DonorCatalog donorCatalog;
    private InterviewSchedule interviewSchedule=new InterviewSchedule();

	public Orphanage() {
		this.donorCatalog = new DonorCatalog();
		this.donation_catalog = new DonationCatalog();
		this.interviewSchedule = new InterviewSchedule();
	}

	public DonorCatalog getDonorCatalog1() {
		return donorCatalog;
	}

	public void setDonorCatalog1(DonorCatalog donorCatalog) {
		this.donorCatalog = donorCatalog;
	}
    public ChildrenCatalogue viewChildren()
    {
    	children_catalogue.getAllchildren();
		return children_catalogue;
    	
    }
    public DonationCatalog viewalldonors()
    {
    	
    	donorCatalog.getAllDonors();
		return donation_catalog;
 
    }
    
    public List<Parent> viewallParents()
    {
    	List<Parent> parentlist = null;
    	// get all parents from db and store it in parent list
    	return parentlist;
    }
    public Boolean MakeNewAdoption(Parent p, List<Child> c)
    {
    	return adoption_catalog.MakeNewAdoption(p,c);
    }
    
    public Address getAddress() {
		return address;
	}
	
	public boolean reserveSlot(Person person,String date, String time)
	{
		
		return interviewSchedule.reserveSlot(person,date,time);
		
	}
	public List<Available_Slot> MakeNewAppointment(Person person,String date)
	{
		
		return interviewSchedule.MakeNewAppointment(person,date);
		
		
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
	public static Boolean VerifyPerson(String cnic, String name) {
		Person person=new Person();
//		return person.VerifyPerson(cnic,name);
		return true;
		
	}

	public ChildrenCatalogue getChildren_catalogue() {
		return children_catalogue;
	}

	public void setChildren_catalogue(ChildrenCatalogue children_catalogue) {
		this.children_catalogue = children_catalogue;
	}
	public DonorCatalog getDonorCatalog() {
		return donorCatalog;
	}
	public void setDonorCatalog(DonorCatalog donorCatalog) {
		this.donorCatalog = donorCatalog;
	}
	
	public static Boolean Login1(String text, String text2) {
		// TODO Auto-generated method stub
		return true;
	}
	public void viewDonorHandler(String CNIC){
		this.donorCatalog.getDonor(CNIC);
	}

	public void registerDonorHandler(String cnic,String name, Date dateOfBirth, String gender, String nationality, Address address, ContactInfo contactInfo) {
		this.donorCatalog.createDonor(cnic,name, address, dateOfBirth, gender, nationality, contactInfo);
	}

	public void addDonation(ArrayList<Item> items, int donorID){
		System.out.println("FDF");
		this.donation_catalog.addDonation(items, donorID);
	}



	public void getAvailableSlots(){
		this.interviewSchedule.getS();
	}


}

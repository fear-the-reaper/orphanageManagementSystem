package businessLogic;

import services.DbHandler;

import java.sql.Date;
import java.util.ArrayList;

public class DonorCatalog {
    private ArrayList<Donor> donors;

    public ArrayList<Donor> getDonors() {
        return donors;
    }

    public DonorCatalog() {
        this.donors = new ArrayList<Donor>();
    }

    public DonorCatalog(ArrayList<Donor> donors) {
        this.donors = donors;
    }

    public void setDonors(ArrayList<Donor> donors) {
        this.donors = donors;
    }

//    TODO: Make View Donor Functionality
    public void getDonor(int CNIC){
        DbHandler db = new DbHandler();
        Donor donor = db.getDonor(CNIC);
        if (donor == null) {
            System.out.println("Couldn't get donor");
        }
        else {
            System.out.println("HERE" + donor.toString());
        }
    }

    //TODO: Make Register Donor Functionality
    public void createDonor(String name, Address address, Date dateOfBirth, String gender, String nationality, ContactInfo contactInfo, int CNIC){
        Donor newDonor = new Donor(name, dateOfBirth, gender, nationality, address, CNIC, contactInfo);
        DbHandler db = new DbHandler();
        Donor isDonor = db.getDonor(CNIC);
        if (isDonor == null) {
            db.saveDonor(newDonor);
            this.donors.add(newDonor);
            System.out.println("New Donor Added!");
        }
        else {
            System.out.println("Donor is already there!");
        }
    }


}

package businessLogic;

import java.sql.Date;
import java.util.ArrayList;

public class DonationCatalog {
    private ArrayList<Donation> donations;

    public DonationCatalog() {
        this.donations = new ArrayList<Donation>();
    }

    public DonationCatalog(ArrayList<Donation> donations) {
        this.donations = donations;
    }

    public ArrayList<Donation> getDonations() {
        return donations;
    }

    public void setDonations(ArrayList<Donation> donations) {
        this.donations = donations;
    }

    @Override
    public String toString() {
        String donationStr = "";
        for (Donation donation :
                donations) {
            donationStr.concat(donation.toString() + " ");
            System.out.println(donation.toString());
        }
        return donationStr;
    }

//    TODO: Creating donation -> add in List and in DB
    public void addDonation(ArrayList<Item> items){
        Date dateOfEntry = Date.valueOf("2021-10-21");
        Donation newDonation = new Donation(items, dateOfEntry, 1);
        this.donations.add(newDonation);
    }




}

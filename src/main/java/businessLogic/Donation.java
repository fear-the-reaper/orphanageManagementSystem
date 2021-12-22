package businessLogic;

import java.sql.Date;
import java.util.ArrayList;

public class Donation {
    private ArrayList<Item> items;
    private Date donationDate;
    private int donorID;

    public Donation(ArrayList<Item> items, Date donationDate, int donorID) {
        this.items = items;
        this.donationDate = donationDate;
        this.donorID = donorID;
    }

    public ArrayList<Item> getItems() {
        return items;
    }

    public void setItems(ArrayList<Item> items) {
        this.items = items;
    }

    public Date getDonationDate() {
        return donationDate;
    }

    public void setDonationDate(Date donationDate) {
        this.donationDate = donationDate;
    }

    public int getDonorID() {
        return donorID;
    }

    public void setDonorID(int donorID) {
        this.donorID = donorID;
    }

    @Override
    public String toString() {
        String itemsStr = "";
        for (Item item: items) {
            itemsStr.concat(item.toString());
            System.out.println(item.toString());
        }
        return "Donation{" +
                "items=" + itemsStr +
                ", donationDate=" + donationDate +
                ", donorID=" + donorID +
                '}';
    }

//    Adding donated items(Toys, Books, Money)
    public void addItems(Item item){
        System.out.println(item.toString());
    }

}

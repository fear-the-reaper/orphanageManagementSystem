package businessLogic;

import java.sql.Date;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args){
        System.out.println("Hello world");

        System.out.println("YO?");
        Orphanage orphanage = new Orphanage();
        Date dateOfEntry = Date.valueOf("1999-10-21");
        Toy toy = new Toy(1, dateOfEntry, "Spider-man", "Action figure");
        java.util.Date utilDate = new java.util.Date();
        Date currentDate = new Date(utilDate.getTime());
        Title title = new Title("Tuesdays with Morrie", "summary", "Mitch Ablom");
        Book book = new Book(3, currentDate, title, "penguin");
        ArrayList<Item> items = new ArrayList<Item>();
        items.add(toy);
        items.add(book);
        orphanage.addDonation(items);
//        orphanage.viewDonorHandler(444);
//        String info = "some Donor";
//        String name = "Hussain";
//        Date dateOfBirth = Date.valueOf("1999-10-21");
//        String gender = "male";
//        Address address = new Address("Pakistan", "karachi", 1, 2);
//        ContactInfo contactInfo = new ContactInfo("2", "mshk9991@gmail.com");
//        int CNIC = 666;
//        String nationality = "Pakistani";
//        orphanage.registerDonorHandler(name, dateOfBirth, gender, nationality, address, contactInfo, CNIC);
    }
}

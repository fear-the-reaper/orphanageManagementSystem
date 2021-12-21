package businessLogic;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;

import java.sql.Date;

public class Main {
    public static void main(String[] args){
        System.out.println("Hello world");

        System.out.println("YO?");
        Orphanage orphanage = new Orphanage();
        orphanage.viewDonorHandler(444);
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

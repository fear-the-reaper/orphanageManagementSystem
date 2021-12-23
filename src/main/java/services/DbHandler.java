package services;

import businessLogic.*;
import org.hibernate.Session;
import org.hibernate.Transaction;

import javax.persistence.TypedQuery;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
import java.sql.SQLIntegrityConstraintViolationException;
import java.util.List;

public class DbHandler implements StorageHandler {

    @Override
    public Boolean saveDonor(Donor newDonor) {
        Boolean isAdded = null;
        Session session = FactoryProvider.getFactory().openSession();
        Transaction tx = session.beginTransaction();
        try {
            session.save(newDonor.getAddress());
            session.save(newDonor.getContactInfo());
            session.save(newDonor);
            tx.commit();
            isAdded = true;
        } catch (Exception e){
            System.out.println("Phone number is used by another donor");
            isAdded = false;
        }
        session.close();
        return isAdded;
    }

    @Override
    public void updateDonor(Donor newDonor) {

    }

    @Override
    public Donor getDonor(String donorId) {
        Session session = FactoryProvider.getFactory().openSession();
        Transaction tx = session.beginTransaction();
        Donor donor = (Donor)session.get(Donor.class, donorId);
        tx.commit();
        session.close();
        return donor;
    }

    @Override
    public List<Available_Slot> getAllAvailableSlots() {
        Session session = FactoryProvider.getFactory().openSession();
        CriteriaBuilder cb = session.getCriteriaBuilder();
        CriteriaQuery<Available_Slot> cq = cb.createQuery(Available_Slot.class);
        Root<Available_Slot> rootEntry = cq.from(Available_Slot.class);
        CriteriaQuery<Available_Slot> all = cq.select(rootEntry);
        TypedQuery<Available_Slot> allQuery = session.createQuery(all);
        return allQuery.getResultList();
    }

    @Override
    public void insertAvailableSlot(Available_Slot slot) {
        Session session = FactoryProvider.getFactory().openSession();
        Transaction tx = session.beginTransaction();
        session.save(slot);
        tx.commit();
        session.close();
    }

    @Override
    public Boolean saveDonation(Donation donation) {
        Boolean isAdded = null;
        Session session = FactoryProvider.getFactory().openSession();
        Transaction tx = session.beginTransaction();
        for (Item item : donation.getItems()) {
                if (item instanceof Book){
                    session.save(((Book) item).getTitle());
                }
                if (item instanceof DonatedMoney){
                    session.save(((DonatedMoney) item).getPayment());
                }
                session.save(item);
        }
        isAdded = false;
        session.save(donation);
        tx.commit();
        session.close();
        return isAdded;
    }

    @Override
    public Boolean saveInterivew(Interview interview) {
        Boolean isAdded = null;
        Session session = FactoryProvider.getFactory().openSession();
        Transaction tx = session.beginTransaction();
        try {
            session.save(interview.getParent_to_meet().getAddress());
            session.save(interview.getParent_to_meet().getContactInfo());
            session.save(interview.getParent_to_meet());
            session.save(interview);
            tx.commit();
            isAdded = true;
        } catch (Exception e){
            System.out.println("Phone number is used by another donor");
            isAdded = false;
        }
        session.close();
        return isAdded;
    }


}

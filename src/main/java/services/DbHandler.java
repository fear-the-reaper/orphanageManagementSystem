package services;

import businessLogic.Donor;
import org.hibernate.Session;
import org.hibernate.Transaction;

public class DbHandler implements StorageHandler {

    @Override
    public void saveDonor(Donor newDonor) {
        Session session = FactoryProvider.getFactory().openSession();
        Transaction tx = session.beginTransaction();
        session.save(newDonor.getContactInfo());
        session.save(newDonor);
        tx.commit();
        session.close();
    }

    @Override
    public void updateDonor(Donor newDonor) {

    }

    @Override
    public Donor getDonor(int donorId) {
        Session session = FactoryProvider.getFactory().openSession();
        Transaction tx = session.beginTransaction();
        Donor donor = (Donor)session.get(Donor.class, donorId);
        tx.commit();
        session.close();
        return donor;
    }
}

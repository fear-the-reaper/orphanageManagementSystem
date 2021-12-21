package services;

import businessLogic.Donor;

public interface StorageHandler {
    void saveDonor(Donor newDonor);
    void updateDonor(Donor newDonor);
    Donor getDonor(int donorId);
}

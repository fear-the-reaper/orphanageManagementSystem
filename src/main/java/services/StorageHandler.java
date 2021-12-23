package services;

import businessLogic.*;

import java.util.List;

public interface StorageHandler {
    Boolean saveDonor(Donor newDonor);
    void updateDonor(Donor newDonor);
    Donor getDonor(String donorId);
    List<Available_Slot> getAllAvailableSlots();
    void insertAvailableSlot(Available_Slot slot);
    Boolean saveDonation(Donation donation);
    Boolean saveInterivew(Interview interview);
}

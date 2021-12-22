package businessLogic;

import java.sql.Date;

public class Item {
    private int itemID;
    private Date dateOfEntry;

    public Item() {
    }

    public Item(int itemID, Date dateOfEntry) {
        this.itemID = itemID;
        this.dateOfEntry = dateOfEntry;
    }

    public int getItemID() {
        return itemID;
    }

    public void setItemID(int itemID) {
        this.itemID = itemID;
    }

    public Date getDateOfEntry() {
        return dateOfEntry;
    }

    public void setDateOfEntry(Date dateOfEntry) {
        this.dateOfEntry = dateOfEntry;
    }

    @Override
    public String toString() {
        return "Item{" +
                "itemID=" + itemID +
                ", dateOfEntry=" + dateOfEntry +
                '}';
    }
}

package businessLogic;

import javax.persistence.*;
import java.sql.Date;

@Entity
public class Item {
    @Id
    private int itemID;
    private Date dateOfEntry;
    @ManyToOne
    private Donation donation;
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

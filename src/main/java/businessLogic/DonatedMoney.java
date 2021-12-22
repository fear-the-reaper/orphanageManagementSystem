package businessLogic;

import java.sql.Date;

public class DonatedMoney extends Item{
    private int amount;
    private Payment payment;

    public DonatedMoney(int itemID, Date dateOfEntry, int amount, Payment payment) {
        super(itemID, dateOfEntry);
        this.amount = amount;
        this.payment = payment;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public Payment getPayment() {
        return payment;
    }

    public void setPayment(Payment payment) {
        this.payment = payment;
    }

    @Override
    public String toString() {
        return "DonatedMoney{" +
                "amount=" + amount +
                ", payment=" + payment.toString() +
                '}';
    }
}

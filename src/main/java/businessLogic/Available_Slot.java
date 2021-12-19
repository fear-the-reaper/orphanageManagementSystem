package businessLogic;

import java.sql.Time;
import java.util.Date;

public class Available_Slot {

	private int manager_id;
	private Date available_slot_date;
	private Time available_slot_time;
	public int getManager_id() {
		return manager_id;
	}
	public void setManager_id(int manager_id) {
		this.manager_id = manager_id;
	}
	public Date getAvailable_slot_date() {
		return available_slot_date;
	}
	public void setAvailable_slot_date(Date available_slot_date) {
		this.available_slot_date = available_slot_date;
	}
	public Time getAvailable_slot_time() {
		return available_slot_time;
	}
	public void setAvailable_slot_time(Time available_slot_time) {
		this.available_slot_time = available_slot_time;
	}
}

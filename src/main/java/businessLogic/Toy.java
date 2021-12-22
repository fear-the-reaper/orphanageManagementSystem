package businessLogic;

import java.sql.Date;

public class Toy extends Item {
    private String name;
    private String category;

	public Toy(int itemID, Date dateOfEntry, String name, String category) {
		super(itemID, dateOfEntry);
		this.name = name;
		this.category = category;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	@Override
	public String toString() {
		return "Toy{" +
				"name='" + name + '\'' +
				", category='" + category + '\'' +
				'}';
	}
}

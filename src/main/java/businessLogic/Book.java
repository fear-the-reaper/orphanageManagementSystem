package businessLogic;

import java.sql.Date;

public class Book extends Item{
    private Title title;
    private String publisher;
	public Title getTitle() {
		return title;
	}
	public void setTitle(Title title) {
		this.title = title;
	}
	public String getPublisher() {
		return publisher;
	}
	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}

	public Book(int itemID, Date dateOfEntry, Title title, String publisher) {
		super(itemID, dateOfEntry);
		this.title = title;
		this.publisher = publisher;
	}

	@Override
	public String toString() {
		return "Book{" +
				"title=" + title.toString() +
				", publisher='" + publisher + '\'' +
				'}';
	}
}

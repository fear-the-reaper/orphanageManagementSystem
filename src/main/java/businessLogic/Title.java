package businessLogic;

public class Title {
    private String name;
    private String summary;
    private String author;

	public Title(String name, String summary, String author) {
		this.name = name;
		this.summary = summary;
		this.author = author;
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSummary() {
		return summary;
	}
	public void setSummary(String summary) {
		this.summary = summary;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}

	@Override
	public String toString() {
		return "Title{" +
				"name='" + name + '\'' +
				", summary='" + summary + '\'' +
				", author='" + author + '\'' +
				'}';
	}
}


public class Book extends Library   {

	private boolean hardBack;

	public Book(String title, String author, int cost, String year, boolean hardBack) {
		super(title, author, cost, year);
		this.hardBack = hardBack;

	}

	public boolean isHardBack() {
		return hardBack;
	}

	public void setHardBack(boolean hardBack) {
		this.hardBack = hardBack;
	}

	@Override
	public String toString() {
		return "Book [hardBack=" + hardBack + ", getTitle()=" + getTitle() + ", getAuthor()=" + getAuthor()
				+ ", getCost()=" + getCost() + ", getYear()=" + getYear();
	}
}

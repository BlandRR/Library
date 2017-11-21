
public class Journal extends Library {

	private String countryStudied;

	public Journal(String title, String author, int cost, String year, String countryStudied) {
		super(title, author, cost, year);
		this.countryStudied = countryStudied;
	}

	public String getCountryStudied() {
		return countryStudied;
	}

	public void setCountryStudied(String countryStudied) {
		this.countryStudied = countryStudied;
	}

	@Override
	public String toString() {
		return "Journal [countryStudied=" + countryStudied + ", getTitle()=" + getTitle() + ", getAuthor()="
				+ getAuthor() + ", getCost()=" + getCost() + ", getYear()=" + getYear();
	}

}

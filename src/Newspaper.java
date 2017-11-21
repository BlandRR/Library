
public class Newspaper extends Library   {

	private String companyName;

	public Newspaper(String title, String author, int cost, String year, String companyName) {
		super(title, author, cost, year);
		this.companyName = companyName;
	}

	public String getCompanyName() {
		return companyName;
	}

	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}

	@Override
	public String toString() {
		return "Newspaper [companyName=" + companyName + ", getTitle()=" + getTitle() + ", getAuthor()=" + getAuthor()
				+ ", getCost()=" + getCost() + ", getYear()=" + getYear();
	}


}

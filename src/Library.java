import java.util.ArrayList;
import java.util.Scanner;

public class Library {

	private String Title;
	private String Author;
	private int Cost;
	private String Year;
	//ArrayList<Library> itemlist = new ArrayList<Library>();
	Scanner sc = new Scanner(System.in);
	
	public Library(String title, String author, int cost, String year) {
		Title = title;
		Author = author;
		Cost = cost;
		Year = year;
	}
	
	public Library(String title) {
		Title = title;
	}

	public String getTitle() {
		return Title;
	}

	public void setTitle(String title) {
		Title = title;
	}

	public String getAuthor() {
		return Author;
	}

	public void setAuthor(String author) {
		Author = author;
	}

	public int getCost() {
		return Cost;
	}

	public void setCost(int cost) {
		Cost = cost;
	}

	public String getYear() {
		return Year;
	}

	public void setYear(String year) {
		Year = year;
	}
}

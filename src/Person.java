import java.util.ArrayList;

public class Person {

	private int id;
	private String Name;
	private int age;
	private String occupation;
	private int numberofbooksonLoan;

	
	public Person(int id, String name, int age, String occupation, int numberofbooksonLoan) {
		this.id = id;
		Name = name;
		this.age = age;
		this.occupation = occupation;
		this.numberofbooksonLoan = numberofbooksonLoan;
	}

	public int getid() {
		return id;
	}

	public void setid(int id) {
		this.id = id;
	}

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getOccupation() {
		return occupation;
	}

	public void setOccupation(String occupation) {
		this.occupation = occupation;
	}

	public int getNumberofbooksonLoan() {
		return numberofbooksonLoan;
	}

	public void setNumberofbooksonLoan(int numberofbooksonLoan) {
		this.numberofbooksonLoan = numberofbooksonLoan;
	}

	@Override
	public String toString() {
		return "Person [id=" + id + ", Name=" + Name + ", age=" + age + ", occupation=" + occupation
				+ ", numberofbooksonLoan=" + numberofbooksonLoan + "]";
	}
}

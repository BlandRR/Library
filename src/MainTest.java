import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Test;

public class MainTest {

	@Test
	public void testlibrarygetTitle() {
		// LibraryManager librarymanager = new LibraryManager();
		Library library = new Book("Title", "Author", 2, "2000", false);
		assertEquals(library.getTitle(), "Title");
		// assertEquals(librarymanager.addItem(library));

	}

	@Test
	public void testlibrarysetTitle() {
		// LibraryManager librarymanager = new LibraryManager();
		Library library = new Book("Title", "Author", 2, "2000", false);
		library.setTitle("Billy");
		assertEquals(library.getTitle(), "Billy");

	}

	@Test
	public void testlibrarygetAuthor() {
		// LibraryManager librarymanager = new LibraryManager();
		Library library = new Book("Title", "Author", 2, "2000", false);
		assertEquals(library.getAuthor(), "Author");
		// assertEquals(librarymanager.addItem(library));

	}

	@Test
	public void testlibrarysetAuthor() {
		// LibraryManager librarymanager = new LibraryManager();
		Library library = new Book("Title", "Author", 2, "2000", false);
		library.setAuthor("NewAuthor");
		assertEquals(library.getAuthor(), "NewAuthor");

	}

	@Test
	public void testlibrarygetCost() {
		// LibraryManager librarymanager = new LibraryManager();
		Library library = new Book("Title", "Author", 2, "2000", false);
		assertEquals(library.getCost(), 2);
		// assertEquals(librarymanager.addItem(library));

	}

	@Test
	public void testlibrarysetCost() {
		// LibraryManager librarymanager = new LibraryManager();
		Library library = new Book("Title", "Author", 2, "2000", false);
		library.setCost(5);
		assertEquals(library.getCost(), 5);

	}

	@Test
	public void testlibrarygetYear() {
		// LibraryManager librarymanager = new LibraryManager();
		Library library = new Book("Title", "Author", 2, "2000", false);
		assertEquals(library.getYear(), "2000");
		// assertEquals(librarymanager.addItem(library));

	}

	@Test
	public void testlibrarysetYear() {
		// LibraryManager librarymanager = new LibraryManager();
		Library library = new Book("Title", "Author", 2, "2000", false);
		library.setYear("2001");
		assertEquals(library.getYear(), "2001");

	}

	@Test
	public void testjournalgetCountrystudied() {
		// LibraryManager librarymanager = new LibraryManager();
		Journal library = new Journal("Title", "Author", 2, "2000", "UK");
		assertEquals(library.getCountryStudied(), "UK");
		// assertEquals(librarymanager.addItem(library));

	}

	@Test
	public void testjounalsetCountrystudied() {
		// LibraryManager librarymanager = new LibraryManager();
		Journal library = new Journal("Title", "Author", 2, "2000", "UK");
		library.setCountryStudied("France");
		assertEquals(library.getCountryStudied(), "France");

	}

	@Test
	public void testnewspapergetCompanyname() {
		// LibraryManager librarymanager = new LibraryManager();
		Newspaper library = new Newspaper("Title", "Author", 2, "2000", "Times");
		assertEquals(library.getCompanyName(), "Times");
		// assertEquals(librarymanager.addItem(library));

	}

	@Test
	public void testnewspapersetCompanyname() {
		// LibraryManager librarymanager = new LibraryManager();
		Newspaper library = new Newspaper("Title", "Author", 2, "2000", "France");
		library.setCompanyName("USA");
		assertEquals(library.getCompanyName(), "USA");

	}

	@Test
	public void testbookisHardBack() {
		// LibraryManager librarymanager = new LibraryManager();
		Book library = new Book("Title", "Author", 2, "2000", false);
		assertEquals(library.isHardBack(), false);
		// assertEquals(librarymanager.addItem(library));

	}

	@Test
	public void testbooksetisHardBack() {
		// LibraryManager librarymanager = new LibraryManager();
		Book library = new Book("Title", "Author", 2, "2000", false);
		library.setHardBack(true);
		assertEquals(library.isHardBack(), true);

	}

	@Test
	public void testaddItem() {

		// ArrayList<Library> itemlist = new ArrayList<Library>();
		LibraryManager librarymanager = new LibraryManager();
		Library library = new Book("Title", "Author", 2, "2000", false);
		librarymanager.addItem(library);

		// assertEquals(itemlist.get(0), library = new Book("Title", "Author", 2,
		// "2000", false));
		assertEquals(librarymanager.itemlist.get(0), library);
	}

	@Test
	public void testremoveItem() {

		LibraryManager librarymanager = new LibraryManager();
		Library library = new Book("Title", "Author", 2, "2000", false);
		Library library2 = new Book("Title", "Author", 2, "2000", false);

		librarymanager.addItem(library);
		librarymanager.addItem(library2);

		librarymanager.removeItem(library);
		assertEquals(librarymanager.itemlist.get(0), library2);
	}

	@Test
	public void testupdateItem() {

		LibraryManager librarymanager = new LibraryManager();
		Library library = new Book("Title", "Author", 2, "2000", false);
		librarymanager.addItem(library);
		librarymanager.updateItem("Title");
		assertEquals(librarymanager.itemlist.get(0), library);
	}

	@Test
	public void registernewPerson() {

		PersonManager personmanager = new PersonManager();
		Person person = new Person(1, "Ryan", 20, "Stuff", 0);
		personmanager.registerPerson(person);

		assertEquals(personmanager.list.get(0), person);
	}

	@Test
	public void deletepersonbyID() {

		PersonManager personmanager = new PersonManager();
		Person person = new Person(1, "Ryan", 20, "Stuff", 0);
		Person person2 = new Person(2, "Ryan", 20, "Stuff", 0);
		personmanager.registerPerson(person);
		personmanager.registerPerson(person2);
		personmanager.deletePerson(person2);

		assertEquals(personmanager.list.get(0), person);
	}

	@Test
	public void testupdatePerson() {

		PersonManager personmanager = new PersonManager();
		Person person = new Person(1, "Ryan", 20, "Stuff", 0);
		personmanager.registerPerson(person);
		personmanager.updatePerson(1);
		assertEquals(personmanager.list.get(0), person);
	}
	
	

	@Test
	public void testcheckIn() {

		PersonManager personmanager = new PersonManager();
		Person person = new Person(1, "Ryan", 20, "Stuff", 0);
		Person person2 = new Person(2, "Billy", 53, "Goat", 5);
		personmanager.registerPerson(person);
		personmanager.registerPerson(person2);
		

		personmanager.checkinItem(2);

		assertEquals(personmanager.list.get(1).getNumberofbooksonLoan(), 4);
	}
	
	
	

	@Test
	public void testcheckOut() {

		PersonManager personmanager = new PersonManager();
		Person person = new Person(1, "Ryan", 20, "Stuff", 0);
		Person person2 = new Person(2, "Billy", 53, "Goat", 5);
		personmanager.registerPerson(person);
		personmanager.registerPerson(person2);
		

		personmanager.checkoutItem(2);

		assertEquals(personmanager.list.get(1).getNumberofbooksonLoan(), 6);
	}
	
	
	
	
	

}

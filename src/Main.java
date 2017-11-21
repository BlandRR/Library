import java.util.ArrayList;

public class Main {

	
	
	
	public static void main (String[] args) {
		PersonManager personmanager = new PersonManager();
		Person person = new Person(1, "Ryan", 23, "Stuff", 0);
		Person person2 = new Person(2, "", 20, "Builder", 2);
		
		LibraryManager library = new LibraryManager();
		Library item = new Book("Harry Potter", "JK", 20, "2000", false);
		Library item2 = new Newspaper("Breaking News", "Bill", 3, "1999", "Times Paper");
		Library item3 = new Journal("Psychology study", "Psychologicst", 10, "2001", "UK");
		
		
		
		personmanager.registerPerson(person);
		personmanager.registerPerson(person2);
		
	//	personmanager.deletePerson(person2);
	//	personmanager.updatePerson(1);
		
	
		library.addItem(item);
		library.addItem(item2);
		library.addItem(item3);
		
	//	library.removeItem(item2);
		
	//	library.updateItem("Breaking News");
		
		library.updateItem("Harry Potter");
		
		personmanager.checkinItem(2);
		personmanager.checkoutItem(2);
		
		personmanager.print();
		
		
		library.writeToFile(library.itemlist);
		
		System.out.println("----");
	//	library.readfromFile();
		
		library.printoutprint();
		
	}
	
	
}

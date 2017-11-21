import java.util.ArrayList;
import java.util.Scanner;

public class PersonManager implements LibaryInterfacePerson {

	Scanner sc = new Scanner(System.in);
	ArrayList<Person> list = new ArrayList<Person>();
	ArrayList<Library> itemlist = new ArrayList<Library>();
	

	@Override
	public void registerPerson(Person p) {
		list.add(p);

	}

	@Override
	public void deletePerson(Person p) {
		list.remove(p);
	}
	
	@Override
	public void updatePerson(int a) {
		for (Person i : list)
			if (i.getid() == a) {
				System.out.println("Change First Name");
				while (!sc.hasNext("[A-Za-z]+")) {
					System.out.println("Nope, that's not it!");
					sc.next();
				}
				String name = sc.nextLine();
				i.setName(name);
				System.out.print("Name Changed to " + i.getName() + "\n");
			}
			else {
				System.out.println("This ID is not in use");
			}
	}
	
	public void print() {
		for (Person i : list)
			System.out.println(i);
	}
	
	@Override
	public void checkoutItem(int a) {
				for (Person i : list)
					if (i.getid() == a) {
						i.setNumberofbooksonLoan(i.getNumberofbooksonLoan() + 1);
					}
			}


	@Override
	public void checkinItem(int a) {
				for (Person i : list) 
					if (i.getid() == a) {
						i.setNumberofbooksonLoan(i.getNumberofbooksonLoan() - 1);
					}
			}
	
	
	
	
	
	/*public void deletePerson(int a) {
		for (Person i : list)
			if (i.getid() == a) {
				list.remove(i);
			}
	}*/
	
	
	
	
	
	
	
	
}

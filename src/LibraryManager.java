import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class LibraryManager implements LibraryInterfaceItems {

	ArrayList<Person> list = new ArrayList<Person>();
	ArrayList<Library> itemlist = new ArrayList<Library>();
	Scanner sc = new Scanner(System.in);
	PersonManager personmanager = new PersonManager();

	@Override
	public void addItem(Library p) {
		itemlist.add(p);

	}

	@Override
	public void removeItem(Library p) {
		itemlist.remove(p);

	}

	@Override
	public void updateItem(String a) {
		for (Library i : itemlist)
			if (i.getTitle().equals(a)) {
				System.out.println("Change Title");
				while (!sc.hasNext("[A-Za-z]+")) {
					System.out.println("Nope, that's not it!");
					sc.next();
				}
				String name = sc.nextLine();
				i.setTitle(name);
				System.out.print("Title Changed to " + i.getTitle() + "\n");
			}
	}

	public void writeToFile(ArrayList<Library> itemlist) {

		final String filename = "C:\\Users\\Admin\\" + "LibraryArray" + ".txt";
		BufferedWriter out = null;
		FileWriter writer = null;

		try {

			writer = new FileWriter(filename);
			out = new BufferedWriter(writer);

			for (Library i : itemlist)
				out.write(i.toString() + "\r\n");

		} catch (IOException e) {
			e.printStackTrace();
		}

		finally {
			try {
				if (out != null) {
					out.close();
				}
				if (writer != null) {
					writer.close();
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

	ArrayList<Library> ourfromFile = new ArrayList<Library>();
	/*
	public void readfromFile() {

		final String filename = "C:\\Users\\Admin\\" + "LibraryArray" + ".txt";

		FileReader bufout = null;
		BufferedReader bufin = null;
		try {

			bufout = new FileReader(filename);
			bufin = new BufferedReader(bufout);
			String line = "";
			String[] tester = new String[5];
			while ((line = bufin.readLine()) != null) {
				tester = line.split(" ");
				
				
				for (int i = 0; i < tester.length; i++) {
					tester[i] = tester[i].substring(tester[i].indexOf('=') + 1);
				}
			//	if (tester[0].equals("Book")) {
					if (line.charAt(0) == 'B') {
					Library p1 = new Book (tester[0], tester[1], Integer.parseInt(tester[2]), tester[3], Boolean.getBoolean(tester[4]));
					ourfromFile.add(p1);
				}
			}

		} catch (IOException e) {
			e.printStackTrace();
		}

		finally {
			try {
				if (bufout != null) {
					bufout.close();
				}
				if (bufin != null) {
					bufin.close();
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
		}

	}*/

	public void printoutprint() {
		for (Library i : ourfromFile)
			System.out.println(i);
	}

}

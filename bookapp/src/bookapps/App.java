package bookapps;

import bookapp.services.BookService;
import bookapp.services.BookServiceImpl;

public class App {

	public static void main(String[] args) {
		int choice;
		BookService bService = new BookServiceImpl();
		int index = 0;

		do {
			choice = bService.printMenu();
			switch (choice) {
				case 1 -> bService.insertRecord(index++);
				case 2 -> bService.updateRecord();
				case 3 -> bService.deleteRecord();
				case 4 -> bService.printRecord(index);
				case 5 -> bService.printAllRecord();
				case 0 -> System.out.println("Exit...");
				default -> System.out.println("Invalid Input");
			}
		} while (choice != 0);
	}

}

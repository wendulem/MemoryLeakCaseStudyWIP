
import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		
		public static final libraryBooks bookID = new libraryBooks(18900000);
		libraryBooks.fillOutBooks(bookID);
		
		System.out.println("Enter your book's ID number:");
		Scanner scanner1 = new Scanner(System.in);
		int bookValue = scanner.nextInt()
		
		System.out.println("Would you like to 'check out' or 'return' the book?");
		Scanner scanner2 = new Scanner(System.in);
		String bookAction = scanner.nextLine();
		
		
		if (bookAction == "return") {
			bookID[bookValue]= bookValue;
			System.out.println("Thank you for visiting!");
		} else if (bookAction == "check out") {
			bookID[bookValue] = 0;
			System.out.println("Thank you for visiting!");
			} else {
				System.out.println("Please enter a valid option.");
			}
		System.gc();
	    Thread.sleep(10000);
	}
}

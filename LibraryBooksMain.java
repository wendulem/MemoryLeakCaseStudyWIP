import java.util.Scanner;

public class LibraryBooksMain {
	public static void main(String[] args) {
		//creates new static object for reference
		LibraryBooks lib = new LibraryBooks();
		
		//fills the array books_volumes with values instead of 0
		lib.fillOutBooks();
		
		//prompts the user to enter the ID of their book and takes the input
		System.out.println("Enter your book's ID number:");
		Scanner scanner1 = new Scanner(System.in);
		int bookValue = scanner1.nextInt();
		
		//prompts the user to choose whether they would like to check out or return their book
		System.out.println("Would you like to 'check out' or 'return' the book?");
		Scanner scanner2 = new Scanner(System.in);
		String bookAction = scanner2.nextLine();
		scanner1.close();
		scanner2.close();
		inputValidation(bookValue, bookAction, lib);
	}
	//function that validates user input and calls methods in the LibraryBooks class to act on input
	static public void inputValidation(int bookValue, String bookAction, LibraryBooks lib){
		if (bookAction.equals("return")){
		lib.returnBook(bookValue, bookAction);	
		} else{
			lib.checkOutBook(bookValue, bookAction);
		}
		}
}	


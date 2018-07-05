public class LibraryBooks {
	//initializes integer array for the book ID's
	private int[] books_volumes;
	
	//adds 18.9 million 0 integer values to the array
	public LibraryBooks() {
	this.books_volumes = new int[18900000];
	}
	
	//method for filling the books_volumes array with ascending values from 0 to 18.9 million
public void fillOutBooks() {
	for (int i=0; i < books_volumes.length; i++) {
		books_volumes[i] = i;
	}
}

	//method for reconfiguring the ID of the book to the ID in the array instead of zero (returning)
public void returnBook(int bookValue, String bookAction) {	
	books_volumes[bookValue]= bookValue;
	System.out.println(books_volumes[bookValue]);
	System.out.println("Thank you for visiting!");
		} 
	//method for reconfiguring the ID of the book to zero in the array instead of its value (checking out)
public void checkOutBook (int bookValue, String bookAction) {
		books_volumes[bookValue] = 0;
		System.out.println(books_volumes[bookValue]);
		System.out.println("Thank you for visiting!");
	}
}
public class libraryBooks {
	int[] books;
	
	public libraryBooks(int bookCount) {
	this.books = new int[bookCount];
	}
	
public void fillOutBooks(int[] books) {
	for (int i=1; i < books.length+1; i++) {
		books[i] = i;
	}
}
	
	
	
}

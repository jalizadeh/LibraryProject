import library.Library;
import library.Book;

public class LibraryApp {

	public static void main(String[] args) {

		Library lib = new Library();
		
		lib.add(new Book("author1", "title1"), 1, "C1", 3);
		lib.add(new Book("author2", "title2"), 1, "C1", 3);
		
		System.out.println(lib.getBooks(0, "C1"));
		System.out.println(lib.getBooks(1, "C1"));
		System.out.println(lib.getBooks(2, "C1"));

		Book book = lib.find("author1", "title1");
		if (book == null) {
			System.out.println("Book not found");
		} else {
			System.out.println("Book <" + book.getAuthor() + ", " + book.getTitle() 
									+ "> is located in:");
			System.out.println("> Floor #" + book.getFloor() 
							+ "\n > Closet " + book.getCloset() 
							+ "\n  > Shelf #" + book.getShelf());
		}

	}
}

import library.Library;
import library.Book;

public class LibraryApp {

	public static void main(String[] args) {

		Library lib = new Library();
		lib.add(new Book("author1", "title1"), 1, "C1", 3);
		System.out.println(lib.getBooks(1, "C1"));

		Book book = lib.find("author1", "title1");
		if (book == null) {
			System.out.println("Book not found");
		} else {
			System.out.println("Floor " + book.getFloor() + " Closet "
					+ book.getCloset() + " Shelf " + book.getShelf());
		}

	}
}

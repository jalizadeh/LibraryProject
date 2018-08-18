package library;

public class Library {
	Floor[] floors = new Floor[3];
	
	public Library() {
		// Library has 3 floors
		for (int i = 0; i < floors.length; i++) {
			floors[i] = new Floor(i);
		}
	}

	public boolean add(Book book, int floor, String closet, int shelf) {
		return floors[floor].add(book, closet, shelf);
	}

	public boolean contains(int floor, String closet, int shelf, Book book) {
		return false;
	}

	public String getBooks(int floor, String closet) {
		for(int i =0; i<6;i++) {
			floors[floor].getBooks(closet);
		}
		return "";
	}

	public Book find(String author, String title) {
		return null;
	}

}

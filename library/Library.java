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
		return floors[floor].contains(closet,shelf,book);
	}

	public String getBooks(int floor, String closet) {
		return "Floor #"+ floor +"\n"+ floors[floor].getBooks(closet);
	}

	public Book find(String author, String title) {
		for (int i = 0; i < floors.length; i++) {
			Book b = floors[i].find(author, title);
			if(b != null)
				return b;
		}
		
		return null;
	}
}

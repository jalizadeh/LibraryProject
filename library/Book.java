package library;

public class Book {
	
	private String author, title;
	//which shelf this book is located in?
	Shelf shelf;

	public Book(String author, String title) {
		this.author = author;
		this.title = title;
	}

	public String getAuthor() {
		return author;
	}

	public String getTitle() {
		return title;
	}

	public String toString() {
		return author + ", " + title;
	}

	public int getShelf() {
		return shelf.getNumber();
	}

	public String getCloset() {
		return shelf.getCloset().getName();
	}

	public int getFloor() {
		return shelf.getCloset().getFloorNumber();
	}

	public void setShelf(Shelf shelf) {
		this.shelf = shelf;		
	}
}

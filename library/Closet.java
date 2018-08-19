package library;

public class Closet {
	private String name;
	private Floor floor;
	
	//array of shelves in each closet
	Shelf[] shelves = new Shelf[6];
	
	public Closet(String name, Floor floor) {
		//closet`s name
		this.name = name;
		//closet is located in floor
		this.floor = floor;
		
		//initialize the array of shelves
		for (int i = 0; i < shelves.length; i++) {
			shelves[i] = new Shelf(i, this);
		}
	}

	public String getName() {
		return name;
	}

	public int getFloorNumber() {
		return floor.getNumber();
	}

	public boolean hasName(String name) {
		return this.name.equals(name);
	}

	public String getBooks() {
		String total = "";
		
		for (int i = 0; i < shelves.length; i++) {
			total += "      Shelf #" + (i+1) + "\n" + shelves[i].getBooks();
		}
		
		return total;
	}

	public boolean add(Book book, int shelf) {
		return getShelf(shelf).add(book);
	}

	private Shelf getShelf(int shelf) {
		return shelves[shelf];
	}

	public Book find(String author, String title) {
		for (int i = 0; i < shelves.length; i++) {
			Book b = shelves[i].find(author,title);
			if(b != null)
				return b;
		}
		
		return null;
	}
}

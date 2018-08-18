package library;

public class Floor {
	//array of closets in each floor
	Closet[] closets = new Closet[30];
	private int number;
	
	public Floor(int number) {
		//which floor I am?
		this.number = number;
		
		//closet code + #floor
		for (int i = 0; i < closets.length; i++) {
			closets[i] = new Closet("C"+i, this);
		}		
	}
	
	public boolean add(Book book, String closet, int shelf) {
		return getCloset(closet).add(book, shelf);
	}

	public int getNumber() {
		return number;
	}

	public String getBooks(String closet) {
		return getCloset(closet).getBooks();
	}

	private Closet getCloset(String name) {
		for (int i = 0; i < closets.length; i++) {
			if(closets[i].hasName(name))
				return closets[i];
		}
	
		return null;
	}

	

}

package library;

public class Shelf {
	//each shelf contains 10 books
	Book[] books = new Book[10];
	
	private int number;
	private Closet closet;
	
	public Shelf(int number, Closet closet) {
		//shelf number
		this.number = number;
		//in which closet, this shelf is located?
		this.closet = closet;
	}
	
	
	
	public int getNumber() {
		return number;
	}

	public Closet getCloset() {
		return closet;
	}



	public String getBooks() {
		String total = "";
		
		for (int i = 0; i < books.length; i++) {
			if(books[i] != null)
				total += "Book #" + i + ": "+ 
						books[i].getAuthor() + ", " + books[i].getTitle() + "\n";
		}
		
		return total;
	}
}

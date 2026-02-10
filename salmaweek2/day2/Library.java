package salmaweek2.day2;

public class Library {

	
	//Create two methods to manage book details
	
	public String addBook(String bookTitle) {
		System.out.println("Book added successfully");
		return ("2 States");
	}
		
	public void issueBook() {
		System.out.println("Book issued successfully");
	}
	
	public static void main(String[] args) {
		// Create an Object to call the above 2 methods
		
		Library Object=new Library();
		String addBook=Object.addBook("2 States");
		System.out.println(addBook);
		Object.issueBook();
		

	}

}

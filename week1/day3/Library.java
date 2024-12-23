package week1.day3;

public class Library {
	
	public String addBook(String bookTitle)
	{
		System.out.println("Book Added successfully: "+bookTitle);
		return bookTitle;
	}
	public void issueBook()
	{
		System.out.println("Book issued Successfully");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Library lib =new Library();
		lib.addBook("Word Power");
		lib.issueBook();
	}

}

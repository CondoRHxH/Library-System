package EndUsers;

import java.util.Scanner;

public class DeleteBook implements IOOperation{

	@Override
	public void oper(database database, User user) {
		Scanner s = new Scanner(System.in);
		
		System.out.println("Enter the book name :");
		String bookname = s.next();
		
		int i = database.getBook(bookname);
		if(i>-1) {
			database.deleteBook(i);
			System.out.println("Book deleted succefully");
		} else {
			System.out.println("Book not found");
		}
		
		user.menu(database,user);
	}

	
}

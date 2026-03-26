package EndUsers;

import java.util.Scanner;

public class ReturnBook implements IOOperation{

	@Override
	public void oper(database database, User user) {
		System.out.println("Enter the book name");
		Scanner s = new Scanner(System.in);
		String bookname = s.next();
		if(!database.getBrws().isEmpty()) {
			for(Borrowing b : database.getBrws()) {
				if(b.getBook().getName().matches(bookname) && b.getUser().getName().matches(user.getName())) {
					Book book = b.getBook();
					int i = database.getAllBooks().indexOf(book);
					if(b.getDaysdLeft()<0) {
						System.out.println("You are late nig You have to pay" +Math.abs(b.getDaysdLeft()*50)+"As fine");
					}
					book.setBrwcopies(book.getBrwcopies()+1);
					database.returnBook(b, book, i);
					System.out.print("Book Returned Succefully");
					break;
				} else {
					System.out.print("You Dind't borrow");
				}				
			}
		} else {
			System.out.print("You Dind't borrow");
		}
		user.menu(database, user);
	}

}

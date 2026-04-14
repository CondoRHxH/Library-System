package EndUsers;

import java.util.Scanner;

public class BorrowBook implements IOOperation{

	@Override
	public void oper(database database, User user) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the book name");
		String bookname = s.next();
		
		int i = database.getBook(bookname);
		if(i>-1) {
			Book book = database.getBook(i);
			boolean n = true;
			for(Borrowing b :database.getBrws()) {
				if(b.getBook().getName().matches(bookname) && b.getUser().getName().matches(user.getName())){
					n = false;
					System.out.print("You have borrowed this book before!");
				}
			}
			if(book.getBrwcopies()>1) {
				Borrowing borrowing = new Borrowing(book, user);
				book.setBrwcopies(book.getBrwcopies()-1);
				database.borrowBook(borrowing, book, i);
				System.out.println("You nust return the book Before 14 days from now\n" +"Expiry Date :"+borrowing.getFinish()+"\nEnjoy");
			} else {
				System.out.println("This Book isn't availble for Borrowing");
			}
		} else {
			System.out.println("Bok doesn't exist");
		}
		user.menu(database, user);
	}

}

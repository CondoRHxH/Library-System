package EndUsers;

import java.util.Scanner;

public class CalculateFine implements IOOperation{

	@Override
	public void oper(database database, User user) {
		System.out.println("Enter the book name");
		Scanner s = new Scanner(System.in);
		String bookname = s.next();
		
		for(Borrowing b : database.getBrws()) {
			if(b.getBook().getName().matches(bookname) && b.getUser().getName().matches(user.getName())) {
				if(b.getDaysdLeft()<0) {
					System.out.println("You are late ! You have to pay"+Math.abs(b.getDaysdLeft() * 50)+"As Fine");
				} else {
					System.out.print("You Don't have to pay");
				}
			}
		}
		user.menu(database, user);
	}

}

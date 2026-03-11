package EndUsers;

import java.util.Scanner;

public class Search implements IOOperation{

	@Override
	public void oper(database database, User user) {
		System.out.println("Enter the book name :");
		Scanner s = new Scanner(System.in);
		String name = s.next();
		int i = database.getBook(name);
		
		if(i>-1) {
			database.getBook(i).toString();
		} else {
			System.out.println("The Book doesn't exists");
		}
		user.menu(database,user);
	}

}

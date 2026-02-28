package EndUsers;

import java.util.Scanner;

public class AddBook implements IOOperation {

	@Override
	public void oper(database database, User user) {
		Scanner s = new Scanner(System.in);
		Book book = new Book();
		
		System.out.println("Enter The Book Name : ");
		book.setName(s.next());
		
		System.out.println("Enter The Book Author : ");
		book.setAuthor(s.next());
		
		System.out.println("Enter The Book Publisher : ");
		book.setPublisher(s.next());
		
		System.out.println("Enter The Book Collection adress : ");
		book.setPublisher(s.next());
		
		System.out.println("Enter The Quantite : ");
		book.setQty(s.nextInt());
		
		System.out.println("Enter The Price : ");
		book.setPrice(s.nextInt());
		
		System.out.println("Enter Borrowing pieces : ");
		book.setBrwcopies(s.nextInt());
		
		database.AddBook(book);
		System.out.print("Book Added Succefully");
	}

}

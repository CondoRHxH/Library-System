package EndUsers;

import java.util.Scanner;

public class AddBook implements IOOperation {

	@Override
	public void oper(database database, User user) {
		Scanner s = new Scanner(System.in);
	
		Book book = new Book();
		
		System.out.println("Enter The Book Name : ");
		book.setName(s.nextLine());
		
		System.out.println("Enter The Book Author : ");
		book.setAuthor(s.nextLine());
		
		System.out.println("Enter The Book Publisher : ");
		book.setPublisher(s.nextLine());
		
		System.out.println("Enter The Book Collection adress : ");
		book.setAdress(s.nextLine());
		
		System.out.println("Enter The Quantite : ");
		book.setQty(Integer.parseInt(s.nextLine()));
		
		System.out.println("Enter The Price : ");
		book.setPrice(Integer.parseInt(s.nextLine()));
		
		System.out.println("Enter Borrowing pieces : ");
		book.setBrwcopies(Integer.parseInt(s.nextLine()));
		
		database.AddBook(book);
		System.out.print("Book Added Succefully");
	}

}

package EndUsers;

import java.util.ArrayList;

public class ViewBooks implements IOOperation{

	@Override
	public void oper(database database, User user) {
		ArrayList<Book> books = database.getAllBooks();
		
		System.out.println("Name\t\tAuthor\tPublisher\tCollection location Adress\tStatus\tQty\tPrice"+"\tBorrowin copies");
		
		for(Book b : books) {
			//System.out.println(b.getName()+"\t\t"+b.getAuthor()+"\t\t"+b.getPublisher()+"\t\t"+b.getAdress()+"\t"+b.getStatus()+"\t"+b.getQty()+"\t"+b.getPrice()+"\t"+b.getBrwcopies());
			System.out.println(b.getName()+"\t\t"+b.getAuthor()+"\t\t"+b.getPublisher()+"\t\t"+b.getAdress()+"\t"+b.getQty()+"\t"+b.getPrice()+"\t"+b.getBrwcopies());
		
		}
		System.out.println();
		user.menu(database, user);
	}

}

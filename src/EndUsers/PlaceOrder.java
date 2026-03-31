package EndUsers;

import java.util.Scanner;

public class PlaceOrder implements IOOperation{

	@Override
	public void oper(database database, User user) {
		
		Order order = new Order();
		System.out.println("Enter Book Name");
		Scanner s = new Scanner(System.in);
		String bookname = s.next();
		
		int i = database.getBook(bookname);
		
		if(i<=-1) {
			System.out.print("Book doesn't exists");
		} else {
			order.setBook(database.getBook(i));
			order.setUser(user);
			System.out.println("Enter Qty");
			int qty = s.nextInt();
			order.setQty(qty);
			order.setPrice(book.getPrice()*qty);
			database.addOrder(order);
			System.out.print("Order Placed Succefully");
		}
	}

}

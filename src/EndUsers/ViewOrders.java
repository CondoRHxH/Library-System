package EndUsers;

import java.util.ArrayList;
import java.util.Scanner;

public class ViewOrders implements IOOperation{

	@Override
	public void oper(database database, User user) {
		System.out.println("Enter the book name");
		Scanner s = new Scanner(System.in);
		String bookname = s.next();
		
		int i = database.getBook(bookname);
		
		if(i>-1) {
			System.out.print("Book\t\tUser\t\tPrice\t\tQty");
			//ArrayList<Order> orders = new ArrayList<Order>();
			for(Order order : database.getAllOrders()) {
				if(order.getBook().getName().matches(bookname)) {
					System.out.print(order.getBook().getName()+"\t\t"+order.getUser().getName()+"\t\t"+order.getQty()+"\t\t"+order.getPrice());
				}
				System.out.println();
			}
			
		} else {
			System.out.print("Book doens't exists");
		}
		user.menu(database, user);
	}

}

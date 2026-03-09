package EndUsers;

import java.util.Scanner;

public class admin extends User{
	private EndUsers.IOOperation[] operations;
	
	public admin(String name) {
		super(name);
		this.operations = new IOOperation[] {
				new ViewBooks(),
				new DeleteAllData(),
				new AddBook(),   // Implemting from the AddBook 
				new DeleteBook(),
				new Exit(),
				new Search(),
				new ViewOrders()
		};
	}

	public admin(String name, String email, String pass) {
		super(name,email,pass);
		this.operations = new IOOperation[] {   // Implemting from the AddBook 
				new ViewBooks(),
				new DeleteAllData(),
				new AddBook(),    // Order plays a role
				new DeleteBook(),
				new Exit(),
				new Search(),
				new ViewOrders()
		};
	}
	
	@Override
	public void menu(database database, User user) {

	    Scanner sc = main.sc;  // use same scanner
	    int n;

	    do {

	        System.out.println("\n/1. View Books");
	        System.out.println("/2. Delete Books");
	        System.out.println("/3. Add Books");
	        System.out.println("/4. Search");
	        System.out.println("/5. Delete all data");
	        System.out.println("/6. View Orders");
	        System.out.println("/7. Exit");

	        n = Integer.parseInt(sc.nextLine());

	        if (n >= 1 && n <= 7) {
	            IOOperation op;
	            switch(n) {
	                case 3: // Add Book
	                    op = new AddBook(); // new instance every time
	                    break;
	                case 1:
	                    op = new ViewBooks();
	                    break;
	                case 2:
	                    op = new DeleteBook();
	                    break;
	                case 4:
	                    op = new Search();
	                    break;
	                case 5:
	                    op = new DeleteAllData();
	                    break;
	                case 6:
	                    op = new ViewOrders();
	                    break;
	                case 7:
	                    op = new Exit();
	                    break;
	                default:
	                    op = null;
	            }
	            if(op != null) op.oper(database, user);
	        }else {
	            System.out.println("Invalid choice");
	        }

	    } while (n != 7);
	}

	@Override
	public String toString() {
		return name+"<N/>"+email+"<N/>"+pass+"<N/>"+"Admin";
	}

	@Override
	void getString() {
		// TODO Auto-generated method stub
		
	}
}



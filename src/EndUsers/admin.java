package EndUsers;

import java.util.Scanner;

public class admin extends User{
	private EndUsers.IOOperation[] operations;
	
	public admin(String name) {
		super(name);
		this.operations = new IOOperation[] {
				new AddBook(),   // Implemting from the AddBook 
				new ViewBooks(),
				new DeleteAllData(),
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
	            this.operations[n - 1].oper(database, user);
	        } else {
	            System.out.println("Invalid choice");
	        }

	    } while (n != 7);
	}

	@Override
	public String toString() {
		return name+"<N/>"+email+"<N/>"+pass+"<N/>"+"admin";
	}

	@Override
	void getString() {
		// TODO Auto-generated method stub
		
	}
}



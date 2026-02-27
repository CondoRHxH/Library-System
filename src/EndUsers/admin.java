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
	
	@Override
	public void menu(database database, User user) {
		System.out.print("/1. View Books");
		System.out.print("/2. Delete Books");
		System.out.print("/3. Add Books");
		System.out.print("/4. Search");
		System.out.print("/5. Delete all data");
		System.out.print("/6. View Orders");
		System.out.print("/7. Exit");
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		this.operations[n-1].oper(database, user);
		
		sc.close();
	}

	@Override
	void getString() {
		// TODO Auto-generated method stub
		
	}
}



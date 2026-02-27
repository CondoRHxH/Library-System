package EndUsers;

import java.util.Scanner;

public class normalUser extends User{
	
	public normalUser(String name) {
		super(name);
		this.operations = new IOOperation[] {
				new ViewBooks(),
				new Search(),
				new PlaceOrder(),
				new BorrowBook(),
				new CalculateFine(),
				new ReturnBook(),
				new Exit()
		};
	}
	
	
	public normalUser(String name, String email, String pass) {
		super(name,email,pass);
		this.name = name;
		this.operations = new IOOperation[] {
				new ViewBooks(),
				new Search(),
				new PlaceOrder(),
				new BorrowBook(),
				new CalculateFine(),
				new ReturnBook(),
				new Exit()
		};
	}
	
	@Override
	public void menu(database database, User user) {
		System.out.print("/1. View Books");
		System.out.print("/2. Search");
		System.out.print("/3. Place Order");
		System.out.print("/4. Borrow Book");
		System.out.print("/5. Calculate Fine");
		System.out.print("/6. Return Book");
		System.out.print("/7. Exit");	
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		this.operations[n-1].oper(database, user);
		
		sc.close();
	}
	
		public String toString() {
			return name+"<N/>"+email+"<N/>"+pass+"<N/>"+"normal";
		}


		@Override
		void getString() {
			// TODO Auto-generated method stub
			
		}
}

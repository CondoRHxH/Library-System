package EndUsers;

public class admin extends User{
	private EndUsers.IOOperation[] operations;
	
	public admin(String name) {
		super(name);
		this.operations = new IOOperation[] {
				new AddBook()   // Implemting from the AddBook 
		};
	}

	public admin(String name, String email, String pass) {
		super(name,email,pass);
		this.operations = new IOOperation[] {
				new AddBook()
		};
	}
	
	@Override
	public void menu() {
		System.out.print("/1. View Books");
		System.out.print("/2. Delete Books");
		System.out.print("/3. Add Books");
		System.out.print("/4. Search");
		System.out.print("/5. Delete all data");
		System.out.print("/6. View Orders");
		System.out.print("/7. Exit");
	}
}



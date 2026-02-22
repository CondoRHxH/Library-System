package EndUsers;


public class normalUser extends User{
	public normalUser(String name, String email, String pass) {
		super(name,email,pass);
		this.name = name;
	}
	
	@Override
	public void menu() {
		System.out.print("/1. View Books");
		System.out.print("/2. Search");
		System.out.print("/3. Place Order");
		System.out.print("/4. Borrow Book");
		System.out.print("/5. Calculate Fine");
		System.out.print("/6. Return Book");
		System.out.print("/7. Exit");	}
}

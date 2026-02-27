package EndUsers;

public abstract class User {

	protected String name;
	protected String email;
	protected String pass;
	protected IOOperation[] operations;
	
	public User(String name2) {
		
	}
	
	
	public User(String name, String email, String pass) {
		this.name = name;
		this.email = email;
		this.pass = pass;
	}
	
	
	public String getName() {
		return name;
	}
	public String getEmail() {
		return email;
	}
	public String getPass() {
		return pass;
	}
	
	abstract void getString();
	
	abstract public void menu(database database, User user);
	
}


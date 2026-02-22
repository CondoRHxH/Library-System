package EndUsers;

public abstract class User {

	protected String name;
	protected String email;
	protected String pass;
	
	public User() {
		
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
	
	abstract public void menu();
	
}


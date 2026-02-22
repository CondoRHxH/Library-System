package EndUsers;

import java.util.ArrayList;

public class database {

	ArrayList<User>users = new ArrayList<>();   //Object not a string 
	ArrayList<User>UserNames = new ArrayList<>();
	
	
	public void AddUser(User u) {       // Same as above
		users.add(u);
		UserNames.add(u);
	}
	
	public int login(String email, String password) {
		int n = -1;
		for(User u : users) {
			if(u.getEmail().equals(email) && u.getPass().equals(password)) {
			n = users.indexOf(u);
			break;
			}
		}
		return n;
	}
	
	public User getUser(int n) {
		return users.get(n);
	}
}

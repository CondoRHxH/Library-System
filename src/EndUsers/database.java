package EndUsers;

import java.io.File;
import java.util.ArrayList;

import com.sun.tools.javac.Main;

public class database {

	private ArrayList<User>users = new ArrayList<User>();   //Object not a string 
	private ArrayList<String>Usernames = new ArrayList<String>();
	private ArrayList<Book>books = new ArrayList<Book>();
	private ArrayList<String>booknames = new ArrayList<String>();
	
	private File usersfile = new File(Main.class.getClassLoader().getResource("Users").toExternalForm());
	private File booksfile = new File(Main.class.getClassLoader().getResource("Books").toExternalForm());
	
	public database() {
		if(!usersfile.exists()) {
			usersfile.mkdirs();
		}
		if(!booksfile.exists()) {
			booksfile.mkdirs();
		}
	}
	
	public void AddUser(User u) {       // Same as above
		users.add(u);
		Usernames.add(u.getName());
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
	public void AddBook(Book book) {
		books.add(book);
		booknames.add(book.getName());
	}
}

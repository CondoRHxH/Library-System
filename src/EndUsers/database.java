package EndUsers;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.PrintWriter;
import java.util.ArrayList;

import com.sun.tools.javac.Main;

public class database {

	private ArrayList<User>users = new ArrayList<User>();   //Object not a string 
	private ArrayList<String>Usernames = new ArrayList<String>();
	private ArrayList<Book>books = new ArrayList<Book>();
	private ArrayList<String>booknames = new ArrayList<String>();
	
	private File usersfile = new File("C:\\Users\\HP ProBook\\eclipse-workspace\\Library_System\\data\\Users");
	private File booksfile = new File("C:\\Users\\HP ProBook\\eclipse-workspace\\Library_System\\data\\Books");
	private File folder = new File("C:\\Users\\HP ProBook\\eclipse-workspace\\Library_System\\data");
	
	public database() {
		if(!folder.exists()) {
			folder.mkdirs();
		}
		if(!usersfile.exists()) {
			try {
				usersfile.createNewFile();
				}catch (Exception e) {}
			}
		if(!booksfile.exists()) {
			try {
				booksfile.createNewFile();
				}catch (Exception e) {}
			}
		getUsers();
		getBooks();
	}
	
	public void AddUser(User u) {       // Same as above
		users.add(u);
		Usernames.add(u.getName());
		saveUsers();
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
		saveBooks();
	}
	
	
	private void getUsers() {
		String text1="";
		try {
			BufferedReader br1 = new BufferedReader(new FileReader(usersfile));
			String s1;
			while((s1 = br1.readLine())!= null) {
				text1 = text1 + s1;
			}
			br1.close();
		} catch(Exception e ) {
			System.err.println(e.toString());
		}
		if(!text1.matches("") || !text1.isEmpty()) {
			String[] a1 = text1.split("<NewUser/>");
			for(String s : a1) {
			    String[] a2 = s.split("<N/>");

			    if(a2.length < 4) continue;   // 🔥 PROTECTION

			    if(a2[3].matches("Admin")) {
			        User user = new admin(a2[0],a2[1],a2[2]);
			        users.add(user);
			        Usernames.add(user.getName());
			    } else {
			        User user = new normalUser(a2[0],a2[1],a2[2]);
			        users.add(user);
			        Usernames.add(user.getName());
			    }
			}
		}
	}
	private void saveUsers() {
		String text1="";
		for(User user : users) {
			text1 = text1+user.toString()+"<NewUser/>\n";
		}
		try {
			PrintWriter pw = new PrintWriter(usersfile);
			pw.print(text1);
			pw.close();
			System.out.print("Data Saved");
		} catch(Exception e) {
			System.err.println(e.toString());
		}
	}
	
	private void saveBooks() {
		String text1="";
		for(Book book: books) {
			text1 = text1+book.toString2()+"<NewBook/>\n";
		}
		try {
			PrintWriter pw = new PrintWriter(booksfile);
			pw.print(text1);
			pw.close();
			System.out.print("Data Saved");
		} catch(Exception e) {
			System.err.println(e.toString());
		}
	}
	private void getBooks() {
		String text1="";
		try {
			BufferedReader br1 = new BufferedReader(new FileReader(booksfile));
			String s1;
			while((s1 = br1.readLine())!= null) {
				text1 = text1 + s1;
			}
			br1.close();
		} catch(Exception e ) {
			System.err.println(e.toString());
		}
		if(!text1.matches("") || !text1.isEmpty()) {
			String[] a1 = text1.split("<NewBook/>");
			for(String s : a1) {
				Book book = parseBook(s);
				books.add(book);
				booknames.add(book.getName());
			}
			
		}
	}
	public Book parseBook(String s) {
		String[] a = s.split("<N/>");
		Book book = new Book();
		book.setName(a[0]);
		book.setAuthor(a[1]);
		book.setPublisher(a[2]);
		book.setAdress(a[3]);
		book.setQty(Integer.parseInt(a[4]));
		book.setPrice(Double.parseDouble(a[5]));
		book.setBrwcopies(Integer.parseInt(a[6]));
		return book;
	}
	
	public ArrayList<Book> getAllBooks() {
		return books;}
}

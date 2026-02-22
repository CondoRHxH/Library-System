package EndUsers;


import java.util.Scanner;


public class main {
	static database database;
	
	public static void main(String[] args) {
		database = new database();
		
		int action;
		do {
			System.out.println("Welcome to the app, Please select an action : /1.Login   /2.New User   /3.Exit");
			Scanner s = new Scanner(System.in);
			
			System.out.print("Write down the type :");
			action = s.nextInt();
			
			switch(action) {
			case 1:
				Login();
			case 2:
				NewUser();
			case 0:
				System.exit(0);
			default : System.out.print("Dkhol chi 9lwa mgada :");
			}
		} while(action!=0);
		
		
	}

	
	@SuppressWarnings("unused")
	private static void NewUser() {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Your name");
		String name = sc.nextLine();
		
		System.out.println("Enter You email");
		String email = sc.nextLine();
		
		System.out.println("Enter Your Password : ");
		String pass = sc.nextLine();
		
		System.out.println("Enter Your Type  :/1.Admin  /2.Normal User ");
		int type = sc.nextInt();
		User user;
		if(type == 1) {
			user = new admin(name,email,pass);
		} else {
			user = new normalUser(name,email,pass);
		}
		database.AddUser(user);
		user.menu();
	}

	private static void Login() {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter You email");
		String email = sc.nextLine();
		
		System.out.println("Enter Your Password : ");
		String pass = sc.nextLine();
		
		int n = database.login(email,pass);
		if(n !=-1) {
			User user = database.getUser(n);
			user.menu();
			System.out.print("Created"+user.getName());
		}	else {
			System.out.print("doens tnot exxist");
		}	
		
	}

}

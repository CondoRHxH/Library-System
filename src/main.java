
import java.util.Scanner;

import EndUsers.database;

public class main {
	
	public static void main(String[] args) {
		database dt = new database();
		
		System.out.println("Welcome to the app, Please select an action : /1.Login   /2.New User");
		Scanner s = new Scanner(System.in);
		
		System.out.print("Write down the type :");
		int action = s.nextInt();
		
		switch(action) {
		case 1:
			Login();
			break;
		case 2:
			NewUser();
			break;
		}
		
	}

	
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
	}

	private static void Login() {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter You email");
		String email = sc.nextLine();
		
		System.out.println("Enter Your Password : ");
		String pass = sc.nextLine();
		
		System.out.println("Welcome");
		
		
	}

}

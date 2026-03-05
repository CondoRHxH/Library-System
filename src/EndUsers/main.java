package EndUsers;

import java.util.Scanner;

public class main {

    static database database;
    static Scanner sc = new Scanner(System.in); // ONE SCANNER ONLY

    public static void main(String[] args) {

        database = new database();

        int action;

        do {
            System.out.println("Welcome to the app, Please select an action : /1.Login   /2.New User   /3.Exit");

            System.out.print("Write down the type : ");
            action = Integer.parseInt(sc.nextLine());

            switch (action) {
                case 1:
                    Login();
                    break;
                case 2:
                    NewUser();
                    break;
                case 3:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid choice Please change");
            }

        } while (true);
    }

    private static void NewUser() {

        System.out.println("Enter Your name");
        String name = sc.nextLine();

        System.out.println("Enter You email");
        String email = sc.nextLine();

        System.out.println("Enter Your Password : ");
        String pass = sc.nextLine();

        System.out.println("Enter Your Type  :/1.Admin  /2.Normal User ");
        int type = Integer.parseInt(sc.nextLine());

        User user;

        if (type == 1) {
            user = new admin(name, email, pass);
        } else {
            user = new normalUser(name, email, pass);
        }

        database.AddUser(user);
        user.menu(database, user);
    }

    private static void Login() {

        System.out.println("Enter You email");
        String email = sc.nextLine();

        System.out.println("Enter Your Password : ");
        String pass = sc.nextLine();

        int n = database.login(email, pass);

        if (n != -1) {
            User user = database.getUser(n);
            user.menu(database, user);
            System.out.println("Created " + user.getName());
        } else {
            System.out.println("Does not exist");
        }
    }
}
package EndUsers;

import java.util.Scanner;

public class Exit implements IOOperation {

    private Scanner sc = new Scanner(System.in);
    

    @Override
    public void oper(database database, User user) {
        System.out.println("Are you sure you want to quit? (1.Yes / 2.No)");
        int i = sc.nextInt();
        sc.nextLine(); // consume newline

        if (i == 1) {
            System.out.println("Welcome to the app, Please select an action : ");
            System.out.println("1.Login   2.New User   3.Exit");

            int num = sc.nextInt();
            sc.nextLine();

            switch (num) {
                case 1:
                    Login(database);
                    break;
                case 2:
                    NewUser(database);
                    break;
                case 3:
                    System.out.println("Goodbye 👋");
                    break;
                default:
                    System.out.println("Invalid choice");
            }
        } else {
            user.menu(database, user);
        }
    }

    private void NewUser(database database) {
        System.out.println("Enter Your name:");
        String name = sc.nextLine();

        System.out.println("Enter Your email:");
        String email = sc.nextLine();

        System.out.println("Enter Your Password:");
        String pass = sc.nextLine();

        System.out.println("Enter Your Type: 1.Admin  2.Normal User");
        int type = Integer.parseInt(sc.nextLine());

        User newUser;

        if (type == 1) {
            newUser = new admin(name, email, pass);
        } else {
            newUser = new normalUser(name, email, pass);
        }

        database.AddUser(newUser);
        newUser.menu(database, newUser);
    }

    private void Login(database database) {
        System.out.println("Enter Your email:");
        String email = sc.nextLine();

        System.out.println("Enter Your Password:");
        String pass = sc.nextLine();

        int n = database.login(email, pass);

        if (n != -1) {
            User loggedUser = database.getUser(n);
            System.out.println("Welcome " + loggedUser.getName());
            loggedUser.menu(database, loggedUser);
        } else {
            System.out.println("User does not exist ❌");
        }
    }
}
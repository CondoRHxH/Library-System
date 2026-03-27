package EndUsers;

import java.util.Scanner;

public class Exit implements IOOperation{

	@Override
	public void oper(database database, User user) {
		System.out.println("Are you sure you want to quit");
		Scanner s = new Scanner(System.in);
		int i = s.nextInt();
		if(i==1) {
			s.close();
		}else {
			user.menu(database,user);
		}
	}
		
	}


package EndUsers;

import java.util.Scanner;

public class DeleteAllData implements IOOperation{

	@Override
	public void oper(database database, User user) {
		System.out.println("Are you sure you want to delete \n ");
		Scanner s = new Scanner(System.in);
		int i = s.nextInt();
		if(i==1) {
			database.deleteAllData();
		}else {
			user.menu(database,user);
		}
	}

}

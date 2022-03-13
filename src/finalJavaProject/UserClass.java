package finalJavaProject;

import java.io.IOException;
import java.util.Scanner;

public class UserClass {

	public static void main(String[] args) throws IOException {
		int ch;
		Scanner obj = new Scanner(System.in);
		do {
			
			LockedMe.Menu();
			System.out.println("Enter the number according the operation you want to Execute");
			ch = Integer.parseInt(obj.nextLine());
			switch(ch) {
			case 1:
				LockedMe.getfiles();
				break;
			case 2:
				LockedMe.addfiles();
				break;
			case 3:
				LockedMe.deletefiles();
				break;
			case 4:
				LockedMe.searchfiles();
				break;
			case 5:
				System.exit(0);
				break;
			default:
				System.out.println("An error is occured Please try again.If it was not resloved then also Contact Customer Service");
			}
			
		}
		while(ch>0);
		
		obj.nextLine();
		obj.close();

	}

}

package week2.day3;

import java.util.Scanner;

public class LoginTestData extends TestData{
	public String enterUserName()
	{  
		
		System.out.println("Enter the user name");
		Scanner scan = new Scanner(System.in);
				String userName=scan.nextLine();
				return userName;
	}
	public String enterPassword()
	{
		System.out.println("Enter the Password");
		Scanner scan1 = new Scanner(System.in);
				String password=scan1.nextLine();
				return password;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LoginTestData log =new LoginTestData();
		log.navigateToHomePage();
		log.enterCredentials();
		log.enterUserName();
		log.enterPassword();

	}

}

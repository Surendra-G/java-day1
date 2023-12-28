package tutorial;
import java.util.Scanner;

public class simplecalculator {

	public static void main(String[] args) {
		//create Scanner object to read input from the users
		Scanner scanner = new Scanner(System.in);
		
		//taking the 1st user input
		System.out.print("Enter the 1st number:");
		int a = scanner.nextInt();
		
		//taking the 2nd input from the user
		System.out.print("Enter the 2nd number:");
		int b = scanner.nextInt();
		
		//addition
		int sum = a+b;
		
		//displaying the result
		System.out.println("The addition of the two numbers is "+sum);
		
		//closing the Scanner to prevent from resource leak
		scanner.close();	

	}

}

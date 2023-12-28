package tutorial;
import java.util.Scanner;

public class quantity {

	public static void main(String[] args) {
		// Calculating the price of the items from its quantity
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter the quantity of the item: ");
		double Q = scanner.nextDouble();
		System.out.print("Enter the Price per quantity of the item: ");
		double P = scanner.nextDouble();
		double price = Q*P;
		System.out.println("The Price of the given item is "+price);
		scanner.close();
		
	}

}

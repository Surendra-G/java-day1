package tutorial;
import java.util.Scanner;

public class perimiterofrectangle {

	public static void main(String[] args) {
		// Calculating the perimeter of rectangle
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter the length of the perimeter: ");
		double l = scanner.nextDouble();
		System.out.print("Enter the breath of the perimeter: ");
		double b = scanner.nextDouble();
		double P = 2*(l+b);
		System.out.println("The perimeter of the given rectangle is: "+P);
		scanner.close();

	}

}

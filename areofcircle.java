package tutorial;
import java.util.Scanner;

public class areofcircle {

	public static void main(String[] args) {
		// Area of the Circle
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter the Radius of the Circle: ");
		double r = scanner.nextDouble();
		double Area = Math.PI*r*r;
		System.out.println("The Area of the given Circle is "+Area);
		scanner.close();
		

	}

}

package tutorial;
import java.util.Scanner;

public class Operations {

	public static void main(String[] args) {
		// Simple Calculator
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter the 1st number: ");
		double a = scanner.nextDouble();
		System.out.print("Enter the 2nd number: ");
		double b = scanner.nextDouble();
		
		double add = a+b;
		double sub = a-b;
		double mul = a*b;
		double div = a/b;
		
		System.out.println("The Addition of the given numbers is: "+add);
		System.out.println("The Substraction of the given numbers is: "+sub);
		System.out.println("The Multiplication of the given numbers is: "+mul);
		System.out.println("The Division of the given numbers is: "+div);
		
		scanner.close();

	}

}

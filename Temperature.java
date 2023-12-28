package tutorial;
import java.util.Scanner;

public class Temperature {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter the Celsius value: ");
		double cel = scanner.nextDouble();
		
		double F = (cel*9)/5 + 32;
		System.out.println("The Fahrenheit value of the given celsius value: "+F);
	}

}

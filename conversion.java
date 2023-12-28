package tutorial;
import java.util.Scanner;
public class conversion {

	public static void main(String[] args) {
		// Conversion of Miles into kilometers'
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter the Miles: ");
		double M = scanner.nextDouble();
		double KM = M*1.60934;
		System.out.println("The Kilometer Value of the given Miles is "+KM);
		scanner.close();
		

	}

}

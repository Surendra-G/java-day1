package tutorial;
import java.util.Scanner;

public class CurrencyConversion {

	public static void main(String[] args) {
		// CurrencyConversion
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter the USD Amount: ");
		double USD = scanner.nextDouble();
		System.out.print("Enter the Rupee Exchange rate : ");
		double Ex = scanner.nextDouble();
		double nep = USD*Ex;
		System.out.println("The conversion of the USD into Nepali Rupee is : "+nep);
		scanner.close();
	}

}

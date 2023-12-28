package tutorial;
import java.util.Scanner;
public class interest {

	public static void main(String[] args) {
		// Calculating Simple Interest
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter the principle of the loan: ");
		int P = scanner.nextInt();
		System.out.print("Enter the Time Period of the loan: ");
		double T = scanner.nextDouble();
		System.out.print("Enter the Rate of the loan: ");
		double R = scanner.nextDouble();
		double Interest = (P*T*R)/100;
		System.out.println("The Interest of the given loan is "+Interest);
		scanner.close();
	}

}

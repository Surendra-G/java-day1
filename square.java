package tutorial;
import java.util.Scanner;
public class square {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		//prompt user to input the length of the square
		System.out.print("Enter the length of the square: ");
		double length = scanner.nextDouble();
		
		double Area = length*length;
		System.out.println("The Area of the Square is "+Area);
		
		scanner.close();
	}

}

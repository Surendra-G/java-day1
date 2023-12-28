package tutorial;
import java.util.Scanner;
public class cylinder {

	public static void main(String[] args) {
		// Develop a Java program that calculates the volume of a cylinder. 
		//Prompt the user to enter the radius and height of the cylinder then display the result. 
		//Ensure that the program uses appropriate data types for calculation and output.
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter the Radius of Cylinder: ");
		double radius = scanner.nextDouble();
		System.out.print("Enter the Height of Cylinder: ");
		double height = scanner.nextDouble();
		double Area = Math.PI*radius*radius*height;
		System.out.println("The Area of the Cylinder is "+Area);
		scanner.close();
	}

}

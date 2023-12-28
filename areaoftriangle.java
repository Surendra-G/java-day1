package tutorial;

public class areaoftriangle {

	public static void main(String[] args) {
		int a = 10;
		int b = 12;
		int c = 15;
		int s = (a+b+c)/2;
		System.out.println("The Semi-perimeter of the triangle is "+s);
		double Area = Math.sqrt(s*(s-a)*(s-b)*(s-c));
		System.out.println("The area of triangle is "+ Area);

	}

}

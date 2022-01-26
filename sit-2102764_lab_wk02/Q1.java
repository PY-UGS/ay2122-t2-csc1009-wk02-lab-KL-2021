import java.util.Scanner;

public class Q1 {

	final static double PI = 3.14159;

	public static void main(String[] args) {
		double radius;

		Scanner input = new Scanner(System.in);

		System.out.print("Enter a number for radius: ");
		radius = input.nextDouble();
		System.out.println("The area for the circle of radius " + radius + " is " + (radius * radius * PI));

		input.close();
	}
}

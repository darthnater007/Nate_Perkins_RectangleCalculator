import java.util.Scanner;

public class RectangleCalculator {

	public static void main(String[] args) {
		System.out.println("Welcome to the Rectangle Calculator: \n"
							+ "This program will calculate the area and perimeter of a rectangle \n\n");
		
		Scanner sc = new Scanner(System.in);
		String choice = "y";
		while (choice.equalsIgnoreCase("Y"))
		{
			System.out.print("Enter length:  ");
			double length = sc.nextDouble();
			System.out.print("Enter width: ");
			double width = sc.nextDouble();
			System.out.println();
			double area = length * width;
			double perimeter = length * 2 + width * 2;
			System.out.println("Area: " + area);
			System.out.println("Perimeter: " + perimeter + "\n");
			
			System.out.print("Continue? y/n:");
			choice = sc.next();
			System.out.println("\n");
		}
		sc.close();
		System.out.println("Bye!");
	}

}

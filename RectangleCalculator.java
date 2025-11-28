import java.util.Scanner;

public class RectangleCalculator {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Input the length
        System.out.print("Enter the length of the rectangle: ");
        double length = input.nextDouble();

        // Input the width
        System.out.print("Enter the width of the rectangle: ");
        double width = input.nextDouble();

        // Calculate area
        double area = length * width;

        // Calculate perimeter
        double perimeter = 2 * (length + width);

        // Display results
        System.out.println("Area of the rectangle: " + area);
        System.out.println("Perimeter of the rectangle: " + perimeter);

        input.close();
    }
}

import java.util.Scanner;

public class SumOfTwoNumbers {
    public static void main(String[] args) {
        // Create a Scanner object to read input
        Scanner input = new Scanner(System.in);

        // Input the first number
        System.out.print("Enter the first number: ");
        int num1 = input.nextInt();

        // Input the second number
        System.out.print("Enter the second number: ");
        int num2 = input.nextInt();

        // Compute the sum
        int sum = num1 + num2;

        // Display the result
        System.out.println("The sum is: " + sum);

        // Close the scanner
        input.close();
    }
}

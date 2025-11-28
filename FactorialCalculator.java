import java.util.Scanner;

public class FactorialCalculator {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Input a number
        System.out.print("Enter a non-negative integer: ");
        int number = input.nextInt();

        // Initialize factorial result
        long factorial = 1;

        // Calculate factorial using a for loop
        for (int i = 1; i <= number; i++) {
            factorial *= i;
        }

        // Display the result
        System.out.println("Factorial of " + number + " is: " + factorial);

        input.close();
    }
}
